class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] sort = new int[nums1.length + nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                sort[k++] = nums2[j];
                j++;
            }else{
                sort[k++] = nums1[i++];
            }
        }
        while(i<m){
            sort[k++] = nums1[i++];
        }
        while(j<n){
            sort[k++] = nums2[j++];
        }
        int l = sort.length;
        double ans = 0;
        if(l % 2==0){
            ans = (double)(sort[l/2]+sort[l/2 - 1])/2;
        }else{
            ans = (double)sort[l/2];
        }
        return ans;
    }
}