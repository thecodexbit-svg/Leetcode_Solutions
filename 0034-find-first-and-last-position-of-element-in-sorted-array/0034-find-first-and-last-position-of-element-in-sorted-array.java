class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstElement(nums , target);
        int last = lastElement(nums , target);
        int[] ans = new int[2];
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
    private int firstElement(int[] nums , int k){
        int sp = 0;
        int ep = nums.length-1;
        
        int ans = -1;
        while(sp<=ep){
            int mid = sp + (ep-sp) / 2;
            
            if(nums[mid] == k){
                ans = mid;
                ep = mid - 1;
            }else if(nums[mid] < k){
                sp = mid + 1;
            }else{
                ep = mid - 1;
            }
        }
        return ans;
    }
    private int lastElement(int[] nums , int k){
        int sp = 0;
        int ep = nums.length-1;
        
        int ans = -1;
        while(sp<=ep){
            int mid = sp + (ep-sp) / 2;

            if(nums[mid] == k){
                ans = mid;
                sp = mid + 1;
            }else if(nums[mid] < k){
                sp = mid + 1;
            }else{
                ep = mid - 1;
            }
        }
        return ans;
    }
}