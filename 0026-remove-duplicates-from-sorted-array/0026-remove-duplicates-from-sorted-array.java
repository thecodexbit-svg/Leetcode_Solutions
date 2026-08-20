class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int pointer = 0;
        int idx = 1;
        while(pointer < nums.length-1){
            if(nums[pointer]<nums[pointer+1]){
                count++;
                nums[idx++] = nums[++pointer];
            }else{
                pointer++;
            }
        }
        return count+1;
    }
}