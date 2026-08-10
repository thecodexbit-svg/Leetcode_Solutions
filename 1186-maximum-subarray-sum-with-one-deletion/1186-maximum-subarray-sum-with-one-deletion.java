class Solution {
    public int maximumSum(int[] arr) {
        int noDelet = arr[0];
        int oneDelet = 0;
        int ans = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            int preNoDelet = noDelet;
            noDelet = Math.max(arr[i] , noDelet+arr[i]);
            oneDelet = Math.max(preNoDelet , oneDelet+arr[i]);

            ans = Math.max(ans , Math.max(noDelet , oneDelet));
        }
        return ans;
    }
}