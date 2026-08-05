class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        // int smallest = Integer.MAX_VALUE;
        // int largest = Integer.MIN_VALUE;
        // int sum1 = 0;
        // for(int i=0 ; i<nums.length ; i++){
        //     sum1 += nums[i];
        //     if(nums[i]>largest){
        //         largest = nums[i];
        //     }
        //     if(nums[i]<smallest){
        //         smallest = nums[i];
        //     }
        // }
        // int sum2 = 0;
        // for(int i=smallest ; i<=largest ; i++){
        //     sum2+=i;
        // }
        // if((sum2-sum1)!=0){
        //     ans.add(sum2-sum1);
        //     return ans;
        // }else{
        //     return ans;
        // }
        
        





        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int l = nums[nums.length-1];
        int s = nums[0];
        for(int i=0 ; i<nums.length ; i++){
            set.add(nums[i]);
        }

        
            for(int i=s ; i<=l ; i++){
                if(!set.contains(i)){
                    ans.add(i);
                }
            }
            return ans;

    }
}