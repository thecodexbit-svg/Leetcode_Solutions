class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            set.add(nums[i]);
            if(nums[i]>l){
                l = nums[i];
            }
            if(nums[i]<s){
                s = nums[i];
            }
        }
        for(int i=s ; i<=l ; i++){
                if(!set.contains(i)){
                    ans.add(i);
                }
            }
            return ans;

    }
}