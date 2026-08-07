class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();

        // if (arr.length == 1){
        //     ans.add(arr[0][]);
        //     return ans;
        // }
        // if (arr[0].length == 1) {
        //     int[] ans = new int[arr.length];
        //     for (int i = 0; i < arr.length; i++){
        //         ans.add(arr[i]);
        //     }
        //     return ans;
        // }
        int n = (arr.length)*(arr[0].length);
        
        int p = 0;
        int i = 0;
        int j = 0;
        boolean right = true;
        boolean left = false;
        boolean up = false;
        boolean down = false;

        while (p < n) {
            if (right) {
                ans.add(arr[i][j]);
                p++;
                arr[i][j]= Integer.MIN_VALUE;
                j++;
                if (j >= arr[0].length || arr[i][j]== Integer.MIN_VALUE) {
                    j--;
                    i++;                  
                    right = false;
                    down = true;
                }
            } else if (down) {
                ans.add(arr[i][j]);
                p++;
                arr[i][j]= Integer.MIN_VALUE;
                i++;

                if (i >= arr.length || arr[i][j]== Integer.MIN_VALUE) {
                    i--;
                    j--;                  
                    down = false;
                    left = true;
                }

            } else if (left) {
                ans.add(arr[i][j]);
                p++;
                arr[i][j]= Integer.MIN_VALUE;
                j--;

                if (j < 0 || arr[i][j]== Integer.MIN_VALUE) {
                    j++;
                    i--;                  
                    left = false;
                    up = true;
                }

            } else if (up) {
                ans.add(arr[i][j]);
                p++;
                arr[i][j]= Integer.MIN_VALUE;
                i--;
                if(i<0 || arr[i][j]== Integer.MIN_VALUE){
                  i++;
                  j++;
                  right = true;
                  up = false;
                }
            }
        }

        return ans;
    }
}