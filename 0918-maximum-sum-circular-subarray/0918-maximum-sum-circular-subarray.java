class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentSum1 = nums[0];
        int maxSum = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            currentSum1 = Math.max(currentSum1 + nums[i] , nums[i]);
            maxSum = Math.max(maxSum , currentSum1);
        }

        int currentSum = nums[0];
        int minSum = nums[0];
        int totalSum = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            currentSum = Math.min(currentSum + nums[i] , nums[i]);
            minSum = Math.min(minSum , currentSum);
            totalSum += nums[i];
        }
        int ans1 = totalSum - minSum;
        
        if(maxSum<0){
            return maxSum;
        }
        
        return Math.max(ans1 , maxSum);
        
    }
}