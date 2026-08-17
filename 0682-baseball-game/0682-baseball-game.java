class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0 ; i<operations.length ; i++){
            if(operations[i].equals("C")){
                l.remove(l.size()-1);
            }else if(operations[i].equals("D")){
                l.add(l.get(l.size() - 1) * 2);
            }else if(operations[i].equals("+")){
                l.add(l.get(l.size() - 1) + l.get(l.size() - 2));
            }else{
                l.add(Integer.parseInt(operations[i]));
            }
        }
        int ans = 0;
        for(int i=0 ; i<l.size() ; i++){
            ans += l.get(i);
        }
        return ans;
    }
}