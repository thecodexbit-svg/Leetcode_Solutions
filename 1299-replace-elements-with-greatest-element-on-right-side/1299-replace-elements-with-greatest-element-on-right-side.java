class Solution {
    public int[] replaceElements(int[] arr) {
        int []sufMax = new int[arr.length];
        sufMax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2 ; i>=0 ; i--){
            sufMax[i] = Math.max(arr[i] , sufMax[i+1]);
        }
        for(int i=0 ; i<arr.length-1 ; i++){
            sufMax[i] = sufMax[i+1];
        }
        sufMax[arr.length-1] = -1;
        return sufMax;
    }
}