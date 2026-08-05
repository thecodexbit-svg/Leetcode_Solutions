class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int l = nums[nums.length-1];
        int s = nums[0];
        for(int i=0 ; i<nums.length ; i++){
            set.add(nums[i]);
        }
         for(int i=s ; i<=l ; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;

    }
}