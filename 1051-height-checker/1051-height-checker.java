class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for(int h: heights){
            count[h]++;
        }
        int ans = 0;
        int idx = 0;
        for(int h = 1 ; h<101 ; h++){
            while(count[h]>0){
                if(heights[idx] != h){
                    ans++;
                }
                idx++;
                count[h]--;
            }
        }

        return ans;
    }
}