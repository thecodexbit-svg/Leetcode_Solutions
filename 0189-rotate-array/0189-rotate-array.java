class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        swap(0 , n-1 , nums);
        swap(0 , k-1 , nums);
        swap(k , n-1 , nums);
    }
    public void swap(int i , int j , int[]nums) {
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}