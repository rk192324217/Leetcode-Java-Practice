class Solution {
    public int countPrimes(int n) {
        //seive of Eratosthenes
        if(n<2){return 0;}
        boolean prime[]=new boolean[n];
        for(int i=0;i<n;i++){prime[i]=true;}
        prime[0]=prime[1]=false;
        for(int i=2;n>i*i;i++){
            if(prime[i]){
                for(int j=i*i;j<n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int count=0;
        for(boolean isprime:prime){
            if(isprime){
                count++;
            }
        }
        return count;
    }
}