class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] fre = new int[101];
        for(int val : nums){
            fre[val]++;
        }
        int[] prefre = new int[101];
        prefre[0] = fre[0];
        for(int i=1 ; i<fre.length ; i++){
            prefre[i] = prefre[i-1] + fre[i];
        }
        int[] ans = new int[nums.length];
        int p = 0;
        for(int val : nums){
            ans[p++] = prefre[val] - fre[val];
        }
        return ans;
    }
}