class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1);
        int pre = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == 0){
                pre -= 1;
            }else{
                pre += 1;
            }
            if(map.containsKey(pre)){
                ans = Math.max(ans , i-map.get(pre));
            }else{
                map.put(pre , i);
            }
        }
        return ans;
    }
}