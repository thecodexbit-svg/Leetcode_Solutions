class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] fre = new int[26];
            for(char ch : s.toCharArray()){
                fre[ch-'a']++;
            }
            String key = Arrays.toString(fre);
            if(!map.containsKey(key)){
                map.put(key , new ArrayList<>());
            }
            map.get(key).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> val : map.values()){
            ans.add(val);
        }
        return ans;
    }
}