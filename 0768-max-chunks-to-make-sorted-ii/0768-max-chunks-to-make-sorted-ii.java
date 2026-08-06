class Solution {
    public int maxChunksToSorted(int[] arr) {
        //idea-1 : can be solved through sorting the array -> using map -> max chunk 01 logic

        //idea-2:
        
        int[] preMax = new int[arr.length];
        preMax[0] = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            preMax[i] = Math.max(preMax[i-1] , arr[i]);
        }
        int[] suffMin = new int[arr.length];
        suffMin[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2 ; i>=0 ; i--){
            suffMin[i] = Math.min(suffMin[i+1] , arr[i]);
        }
        int ans = 1;
        for(int i=0 ; i<arr.length-1 ; i++){
            if(preMax[i]<=suffMin[i+1]){
                ans+=1;
            }
        }
        return ans;
    }
}