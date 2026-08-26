class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0 , c2=0;
        int p1=0 , p2=1;
        for(int num : nums){
            if(num == p1){
                c1++;
            }else if(num == p2){
                c2++;
            }else if(c1 == 0){
                p1 = num;
                c1 = 1;
            }else if(c2 ==0 ){
                p2 = num;
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int num : nums){
            if(num == p1) c1++;
            else if(num == p2) c2++;
        }
        List<Integer> ans = new ArrayList<>();
        if(c1 > nums.length/3) ans.add(p1);
        if(c2 > nums.length/3) ans.add(p2);

        return ans;
    }
}