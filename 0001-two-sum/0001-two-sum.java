class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0 ; i<nums.length ; i++){
            int a = target - nums[i];
            if(map.containsKey(a)){
                ans[0] = map.get(a);
                ans[1] = i;
            }
            map.put(nums[i] , i);
        }
        return ans;
    }
}