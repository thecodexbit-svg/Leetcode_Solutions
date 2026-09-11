class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        long ans = 0;
        long mod = 1000000007;
        for(int i=0 ; i<=n ; i++){
            int curr = 0;
            if(i==n){
                curr = 0;
            }else{
                curr = arr[i];
            }
            while(!st.isEmpty() && curr < arr[st.peek()]){
                int idx = st.pop();
                long ele = arr[idx];
                int r = i;
                int l = 0;
                if(st.isEmpty()){
                    l = -1;
                }else{
                    l = st.peek();
                }
                long left = idx - l;
                long right = r - idx;
                ans += ele * left * right;
            }
            st.push(i);
        }
        return (int)(ans%mod);
    }
}