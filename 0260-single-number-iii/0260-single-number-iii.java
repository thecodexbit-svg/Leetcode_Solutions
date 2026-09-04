class Solution {
    public int[] singleNumber(int[] nums) {
        //if(nums.length <= 2) return nums;
        int ab = 0;
        for(int num : nums){
            ab ^= num;
        }
        int rightSetBit = ab & -ab;
        int a = 0;
        for(int num : nums){
            if((num & rightSetBit) != 0){
                a ^= num;
            }
        }
        return new int[]{a , ab^a};
    }
}