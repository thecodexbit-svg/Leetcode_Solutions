class Solution {
    public int[] replaceElements(int[] arr) {
        // suffix max
        for(int i=arr.length-2 ; i>=0 ; i--){
            arr[i] = Math.max(arr[i] , arr[i+1]);
        }
        // shifting by one index
        for(int i=0 ; i<arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}