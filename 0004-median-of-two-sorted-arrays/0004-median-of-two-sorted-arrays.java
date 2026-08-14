class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int m = nums1.length;
        // int n = nums2.length;
        // int[] sort = new int[m+n];
        // int i=0;
        // int j=0;
        // int k=0;
        // while(i<m && j<n){
        //     if(nums1[i]>nums2[j]){
        //         sort[k++] = nums2[j];
        //         j++;
        //     }else{
        //         sort[k++] = nums1[i++];
        //     }
        // }
        // while(i<m){
        //     sort[k++] = nums1[i++];
        // }
        // while(j<n){
        //     sort[k++] = nums2[j++];
        // }
        // int l = sort.length;
        // double ans = 0;
        // if(l % 2==0){
        //     ans = (double)(sort[l/2]+sort[l/2 - 1])/2;
        // }else{
        //     ans = (double)sort[l/2];
        // }
        // return ans;

        int m = nums1.length;
        int n = nums2.length;

        int i=0;
        int j=0;

        int curr = 0;
        int pre = 0;
        int k = m + n;

        for(int p=0 ; p<=k/2 ; p++){
            pre = curr;
            if(i<m && (j>=n || nums1[i] <= nums2[j])){
                curr = nums1[i++];
            }else{
                curr = nums2[j++];
            }
        }
        
        if(k%2==0){
            return (double)(pre+curr)/2.0;
        }
        return curr;
    }
}