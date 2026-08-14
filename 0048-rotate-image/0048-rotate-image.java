class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    private void transpose(int[][] matrix){
        for(int i=1 ; i<matrix.length ; i++){
            for(int j=0 ; j<i ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    private void reverse(int[][] matrix){
        for(int i=0 ; i<matrix.length ; i++){
            int st = 0;
            int ed = matrix[i].length-1;
            while(st<ed){
                int temp = matrix[i][st];
                matrix[i][st] = matrix[i][ed];
                matrix[i][ed] = temp;

                st++;
                ed--;
            }
        }
    }
}