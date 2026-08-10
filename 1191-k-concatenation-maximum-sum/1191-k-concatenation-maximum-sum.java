class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long total = 0;
        for (int num : arr) {
            total += num;
        }
        if (k == 1) { //simple kadane
            long current = 0;
            long best = 0;
            for (int num : arr) {
                current = Math.max(0, current + num);
                best = Math.max(best, current);
            }
                return (int)(best % 1000000007);
        }
        // Maximum subarray in two copies, rest will be repetitions
        long current = 0;
        long best = 0;
        for (int i = 0; i < 2 * arr.length; i++) {
            current = Math.max(0, current + arr[i % arr.length]);
            best = Math.max(best, current);
        }
        if (k > 2 && total > 0) {
            best += total * (k - 2);
        }
        return (int)(best % 1000000007);
    }
}