class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0 ; i<numRows ; i++){
            List<Integer> cl = new ArrayList<>();
            for(int j=0 ; j<i+1 ; j++){
                if(j==0 || j==i){
                    cl.add(1);
                }else{
                    int ele = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    cl.add(ele);
                }
            }
            ans.add(cl);
        }
        return ans;
    }
}