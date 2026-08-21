class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }
            last.put(nums[i], i);
        }
        int deg = 0;
        for (int val : freq.values()) {
            deg = Math.max(deg, val);
        }
        int ans = Integer.MAX_VALUE;
        for (int key : freq.keySet()) {
            if (freq.get(key) == deg) {
                int length = last.get(key) - first.get(key) + 1;
                ans = Math.min(ans, length);
            }
        }
        return ans;
    }
}