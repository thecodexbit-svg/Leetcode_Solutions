class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int h : heights){
            max = Math.max(max , h);
            min = Math.min(min , h);
        }
        String[] sort = new String[max+1];
        for(int i=0 ; i<names.length ; i++){
            sort[heights[i]] = names[i];
        }
        String[] ans = new String[names.length];
        int idx = 0;
        for(int h = max ; h>=min ; h--){
            if(sort[h]!=null){
                ans[idx++] = sort[h];
            }
        } 
        return ans;
    }
}