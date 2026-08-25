class Solution {
    public int findMin(int[] nums) {
        int st = 0;
        int ed = nums.length-1;
        while(st<ed){
            int mid = st + (ed-st)/2;
            if(nums[mid] > nums[ed]){ //checks if the mid element is greater then end point element
                st = mid+1;
            }else if(nums[mid] >= nums[st]){ //checks if mid element is greater then or equals to start point ele.
                ed = mid;
            }else{ // if mid is smaller then both start and end we move towards the larger number.
                if(nums[st]>nums[ed]){
                    ed = mid;
                }else{
                    st = mid+1;
                }
            }
        }
        return nums[st];
    }
}