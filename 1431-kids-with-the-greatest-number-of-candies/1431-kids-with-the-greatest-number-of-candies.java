class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        for(int c : candies){
            greatest = Math.max(greatest , c);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i=0 ; i<candies.length ; i++){
            if(candies[i]+extraCandies >= greatest){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}