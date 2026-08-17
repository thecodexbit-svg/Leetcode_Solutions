class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int count = 0;
        while(temp > 0){
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        int i = count - 1;
        while(num > 0){
            digits[i] = num % 10;
            num /= 10;
            i--;
        }
        for(int p=0 ; p<digits.length ; p++){
            if(digits[p] == 6){
                digits[p] = 9;
                break;
            }
        }
        int ans = 0;
        for(int a : digits){
            ans = ans*10 + a;
        }
        return ans;
    }
}