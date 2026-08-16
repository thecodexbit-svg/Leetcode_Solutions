class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                if(st.isEmpty()){
                    count++;
                }else if(st.peek() == '('){
                    st.pop();
                }
            }
        }
        return st.size() + count;
    }
}