class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num)+1);
            }else{
                map.put(num , 1);
            }
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1]; // array of lists
        for(int num : map.keySet()){ // iterate over keys to avoid duplicates in the nums array
            int freq = map.get(num);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        int[] ans = new int[k];
        int idx = 0;
        for(int i=bucket.length-1 ; i>=0 && idx < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    ans[idx++] = num;
                    if(idx == k){
                        break;
                    }
                }
            }
        }
        return ans;
    }
}