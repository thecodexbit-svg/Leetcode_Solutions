class Solution {
    public int hammingWeight(int n) {
        int ans = 1;
        for(int i=0 ; i<32 ; i++){
            if((n & (n-1)) != 0){
                ans++;
            }
            n = n&(n-1);
        }
        return ans;
    }
}