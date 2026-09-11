class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        // int[] rightSmaller = new int[n];
        // Arrays.fill(rightSmaller, n);
        // Stack<Integer> st1 = new Stack<>();
        // for (int i = 0; i < n; i++) {
        //     while (!st1.isEmpty() && heights[i] < heights[st1.peek()]) {
        //         rightSmaller[st1.pop()] = i;
        //     }
        //     st1.push(i);
        // }
        // int[] leftSmaller = new int[n];
        // Arrays.fill(leftSmaller, -1);
        // Stack<Integer> st2 = new Stack<>();
        // for (int i = n - 1; i >= 0; i--) {
        //     while (!st2.isEmpty() && heights[i] < heights[st2.peek()]) {
        //         leftSmaller[st2.pop()] = i;
        //     }
        //     st2.push(i);
        // }
        // int ans = 0;
        // for (int i = 0; i < n; i++) {
        //     int area = heights[i] *(rightSmaller[i] - leftSmaller[i] - 1);
        //     ans = Math.max(ans, area);
        // }
        // return ans;

        // MONOTONIC STACK
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        for(int i=0 ; i<=n ; i++){
            int currHeight = 0;
            if(i==n){
                currHeight = 0;
            }else{
                currHeight = heights[i];
            }
            while(!st.isEmpty() && currHeight < heights[st.peek()]){
                int h = heights[st.pop()];
                int right = i;
                int left = 0;
                if(st.isEmpty()){
                    left = -1;
                }else{
                    left = st.peek();
                }
                int area = h * (right - left - 1);
                maxArea = Math.max(area , maxArea);
            }
            st.push(i);
        }
        return maxArea;
    }
}