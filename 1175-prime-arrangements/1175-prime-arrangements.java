class Solution {
    public int numPrimeArrangements(int n) {
        boolean[] isComposite = new boolean[n+1];
        for(int i=2 ; i*i<=n ; i++){
            if(!isComposite[i]){
                for(int j=i*i ; j<=n ; j+=i){
                    isComposite[j] = true;
                }
            }
        }
        int primeCount = 0;
        for(int i=2 ; i<=n ; i++){
            if(!isComposite[i]){
                primeCount++;
            }
        }
        int nonprimeCount = n - primeCount;
        long ans = 1;
        long mod = 1000000007L;
        while(primeCount>0){
            ans = (ans * primeCount) % mod;
            primeCount--;
        }
        while(nonprimeCount>0){
            ans = (ans * nonprimeCount) % mod;
            nonprimeCount--;
        }
        
        ans = ans % mod;
        return (int)ans;
    }
}