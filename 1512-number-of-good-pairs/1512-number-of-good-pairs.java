class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] fre = new int[101];
        for(int val : nums){
            fre[val]++;
        }
        int ans = 0;
        for(int val : fre){
            int n = val - 1;
            ans += sum(n);
        }
        return ans;
    }
    private int sum(int n){
        int sum = 0;
        while(n>0){
            sum += n;
            n--;
        }
        return sum;
    }
}