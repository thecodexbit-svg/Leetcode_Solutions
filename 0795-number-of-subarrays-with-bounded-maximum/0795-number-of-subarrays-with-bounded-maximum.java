class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int total_ans = 0;
        int ans = 0;
        int invalid_point = -1;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]<left){
                total_ans += ans;
            }else if(nums[i]>right){
                ans = 0;
                invalid_point = i;
            }else{
                ans = i-invalid_point;
                total_ans += ans;
            }

        }
        return total_ans;
    }
}