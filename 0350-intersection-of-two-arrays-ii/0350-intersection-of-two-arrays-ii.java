class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer , Integer> map1 = new HashMap<>();
            for(int i=0 ; i<nums1.length ; i++){
                if(map1.containsKey(nums1[i])){
                    map1.put(nums1[i] , map1.get(nums1[i])+1);
                }else{
                    map1.put(nums1[i] , 1);
                }
            }
        HashMap<Integer , Integer> map2 = new HashMap<>();
            for(int i=0 ; i<nums2.length ; i++){
                if(map2.containsKey(nums2[i])){
                    map2.put(nums2[i] , map2.get(nums2[i])+1);
                }else{
                    map2.put(nums2[i] , 1);
                }
            }
        for(int key : map1.keySet()){
            if(map2.containsKey(key)){
                int freq = Math.min(map1.get(key) , map2.get(key));
                while(freq-- > 0){
                    ls.add(key);
                }
            }
        }
        int[] ans = new int[ls.size()];
        int p = 0;
        for(int val : ls){
            ans[p++] = val;
        }
        return ans;
    }
}