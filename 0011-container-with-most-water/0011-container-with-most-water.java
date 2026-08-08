class Solution {
    public int maxArea(int[] height) {
        int a = 0;
        int b = height.length-1;
        int ans = 0;
        while(a<b){
            int weidth = b-a;
            int length = Math.min(height[a] , height[b]);
            int waterStored = weidth * length;
            
            ans = Math.max(ans , waterStored);
            if(height[a]<height[b]){
                a++;
            }else{
                b--;
            }
        }
        return ans;

    }
}
