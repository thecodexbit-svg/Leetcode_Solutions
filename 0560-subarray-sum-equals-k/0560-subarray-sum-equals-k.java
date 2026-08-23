class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int pre = 0;
        for(int i=0 ; i<nums.length ; i++){
            int val = nums[i];
            pre += nums[i];
            if(map.containsKey(pre - k)){
                count += map.get(pre - k);
            }
            if(map.containsKey(pre)){
                map.put(pre , map.get(pre)+1);
            }else{
                map.put(pre , 1);
            }
        }
        return count;
    }
}

