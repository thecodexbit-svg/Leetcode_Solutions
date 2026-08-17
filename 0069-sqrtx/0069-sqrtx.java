class Solution {
    public int mySqrt(int x) {
        long high = x;
        long low = 0;
        long ans = 0;
        while(low <= high){
            long mid = low + (high-low)/2;
            if(mid * mid <= x){
                ans = mid;
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return (int)ans;
    }
}