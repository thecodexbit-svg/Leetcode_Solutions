class Solution {
    public int nextGreaterElement(int n) {
        char[] nums = String.valueOf(n).toCharArray();
        int p1 = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p1 = i;
                break;
            }
        }
        if (p1 == -1) {
            return -1;
        }
        int p2 = -1;
        for (int i = nums.length - 1; i > p1; i--) {
            if (nums[i] > nums[p1]) {
                p2 = i;
                break;
            }
        }
        char temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
        reverse(nums, p1 + 1, nums.length - 1);

        long ans =  Long.parseLong(new String(nums));
        if (ans > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) ans;

    }
    private void reverse(char[] nums, int st, int ed) {
        while (st < ed) {
            char temp = nums[st];
            nums[st] = nums[ed];
            nums[ed] = temp;

            st++;
            ed--;
        }
    }
}