class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currentSum1 = nums[0];
        int maxSum = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            currentSum1 = Math.max(nums[i] , currentSum1+nums[i]);
            maxSum = Math.max(maxSum , currentSum1);
        }

        int currentSum2 = nums[0];
        int minSum = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            currentSum2 = Math.min(nums[i] , currentSum2+nums[i]);
            minSum = Math.min(minSum , currentSum2);
        }

        if(minSum < 0){
            minSum = Math.abs(minSum);
        }

        return Math.max(maxSum , minSum);
    }
}