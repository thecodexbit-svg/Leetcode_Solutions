class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int total_ans = 0;
        int last_ans = 0;
        int invalid_point = -1;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]<left){
                total_ans += last_ans;
            }else if(nums[i]>right){
                last_ans = 0;
                invalid_point = i;
            }else{
                last_ans = i-invalid_point;
                total_ans += last_ans;
            }

        }
        return total_ans;
    }
}