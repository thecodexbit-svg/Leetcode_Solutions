class Solution {
    public void nextPermutation(int[] nums) {
        // Step 1: Find the pivot
        // First index from the right such that nums[i] < nums[i+1]
        int p1 = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p1 = i;
                break;
            }
        }
        // Special case:
        // Array is completely decreasing like [3,2,1]
        // Next permutation is the first permutation [1,2,3]
        if (p1 == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        // Step 2: Find the smallest element greater than nums[p1]
        // Since the suffix is decreasing,
        // the first element from the right greater than nums[p1]
        // is exactly what we need.
        int p2 = -1;
        for (int i = nums.length - 1; i > p1; i--) {
            if (nums[i] > nums[p1]) {
                p2 = i;
                break;
            }
        }
        // Step 3: Swap pivot and successor
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
        // Step 4: Reverse the suffix
        // The suffix was decreasing, so reversing it
        // makes it the smallest possible arrangement.
        reverse(nums, p1 + 1, nums.length - 1);
    }
    private void reverse(int[] nums, int st, int ed) {
        while (st < ed) {
            int temp = nums[st];
            nums[st] = nums[ed];
            nums[ed] = temp;

            st++;
            ed--;
        }
    }
}