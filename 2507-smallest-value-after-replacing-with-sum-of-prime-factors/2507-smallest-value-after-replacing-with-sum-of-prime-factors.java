class Solution {
    public int smallestValue(int n) {
        // int sum = 0;
        // for(int i = 2 ; i*i<= n ; i++){
        //     if(n %i ==0){
        //         while(n %i ==0){
        //             sum += i;
        //             n /= i;
        //         }
        //     }
        // }
        // if(n > 1) {
        //     sum += n;
        // }
        
        // return helper(sum);

        while(true){
            int preSum = n;
            int sum = 0;
            for(int i=2 ; i*i<=n ; i++){
                if(n % i == 0){
                    while(n % i == 0){
                        sum += i;
                        n /= i;
                    }
                }
            }
            if(n > 1){
                sum += n;
            }
            if(preSum == sum){
                return preSum;
            }
            n = sum;
        }

    }
    // private int helper(int sum){
    //     int preSum = sum;
    //     int s = 0;
    //     List<Integer> tempfact = new ArrayList<>();
    //     for(int i = 2 ; i*i<= sum ; i++){
    //         if(sum %i ==0){
    //             while(sum %i ==0){
    //                 s += i;
    //                 sum /= i;
    //             }
    //         }
    //     }
    //     if(sum > 1){
    //         s += sum;
    //     }

    //     if(preSum == s){ //BASE CASE
    //         return s;
    //     }

    //     return helper(s);
    // }
}