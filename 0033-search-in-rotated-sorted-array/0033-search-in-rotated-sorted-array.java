class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        int ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target){
                ans = mid;
                return ans;
            }else if(nums[lo] <= nums[mid]){ //checking if the left side is sorted
                if(nums[lo]<= target && target < nums[mid]){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }else{ // or else the right part is sorted
                if(nums[mid] < target && target<= nums[hi]){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }
        return ans;
    }
}