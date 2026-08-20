class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1] < target) return nums.length;
        int high = nums.length-1;
        int low = 0;
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                ans = mid;
                return ans;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
                ans = low;
            }
        }
        return ans;
    }
}