class Solution {
    public int singleNumber(int[] nums) {
        int one = 0;
        int two = 0;
        for(int i : nums){
            one ^= i & ~(two); 
            two ^= i & ~(one); 
        }
        return one;
    }
}