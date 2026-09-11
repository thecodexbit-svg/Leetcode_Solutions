class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> st = new ArrayDeque<>();
        int j = 0;
        for(int i=0 ; i<pushed.length ; i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}