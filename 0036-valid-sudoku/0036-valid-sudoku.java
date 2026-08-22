class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0 ; i<board.length ; i++){
            HashSet<Character> seenRow = new HashSet<>();
            for(int j=0 ; j<board[i].length ; j++){
                if(board[i][j] == '.') {
                    continue;
                }
                if(seenRow.contains(board[i][j])) {
                    return false;
                }
                seenRow.add(board[i][j]);
            }
        }
        
        for(int i = 0 ; i<board[0].length ; i++){
            HashSet<Character> seenCol = new HashSet<>();
            for(int j=0 ; j<board.length ; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(seenCol.contains(board[j][i])){
                    return false;
                }
                seenCol.add(board[j][i]);
            }
        }

        for(int row = 0; row < 9; row += 3){
            for(int col = 0; col < 9; col += 3){

                HashSet<Character> seenBox = new HashSet<>();

                for(int i = row; i < row + 3; i++){
                    for(int j = col; j < col + 3; j++){
                        if(board[i][j] == '.'){
                            continue;
                        }
                        if(seenBox.contains(board[i][j])){
                            return false;
                        }
                        seenBox.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}