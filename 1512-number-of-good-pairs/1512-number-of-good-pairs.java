class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] fre = new int[101];
        for(int val : nums){
            fre[val]++;
        }
        int ans = 0;
        for(int val : fre){
            int n = val - 1;
            ans += (n*(n+1))/2;
        }
        return ans;
    }
}