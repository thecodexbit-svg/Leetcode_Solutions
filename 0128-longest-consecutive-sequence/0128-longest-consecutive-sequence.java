class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            seen.add(num);
        }
        int maxLength = 0;
        for(int num : seen){
            if(!seen.contains(num -1)){
                int length = 1;
                int current = num;
                while(seen.contains(current + 1)){
                    current++;
                    length++;   
                }
                maxLength = Math.max(length , maxLength);
            }
        }
        return maxLength;
    }
}