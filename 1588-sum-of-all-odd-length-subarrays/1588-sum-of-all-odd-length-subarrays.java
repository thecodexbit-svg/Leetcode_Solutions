class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        long totalSum = 0;
        for(int i=0 ; i<n ; i++){
            long count = ((long)(i+1)*(n-i)+1)/2; // formula of contribution of that element in every odd length subarray.
            totalSum += arr[i] * count;
        }
        return (int)totalSum;
    }
}