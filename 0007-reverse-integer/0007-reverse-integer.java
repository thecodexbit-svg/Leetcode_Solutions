class Solution {
    public int reverse(int x) {
        int ans = 0;
        while(x != 0){
            int lastDigit = x%10;
            x /= 10;

            //positive Overflow check
            if(ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE && lastDigit > 7)){
                return 0;
            }

            //negative overflow check
            if(ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE && lastDigit < -8)){
                return 0;
            }

            ans *= 10;
            ans+= lastDigit;
        }
        return ans;
    }
}