class Solution {
    public int mirrorDistance(int n) {
        int m = n;
        int n2 = 0;
        while(m>0){
            int l = m%10;
            n2 = (n2*10) + l;
            m = m/10;
        }
        return Math.abs(n2-n);
    }
}