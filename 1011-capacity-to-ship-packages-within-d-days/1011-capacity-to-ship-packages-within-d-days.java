class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        for(int val : weights){
            min = Math.max(min , val);
            max += val;
        }

        while(min < max){
            int cap = min + (max-min)/2;
            int d = checking(weights , cap);
            if(d <= days) {
                max = cap;
            }else {
                min = cap + 1;
            }
        }
        return min;
    }
    private int checking(int[] weights , int cap){
        int days = 1;
        int sum = 0;
        for (int weight : weights) {
            if (sum + weight > cap) {
                days++;
                sum = 0;
            }
            sum += weight;
        }
        return days;
    }
}