class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum=0,evenSum=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }
        return gcd(oddSum,evenSum);
        // return n; this will also work 

    }
    public int gcd(int n1,int n2){
        int rem;
        while(n2!=0){
            rem=n1%n2;
            n1=n2;
            n2=rem;

        }
        return n1;
    }
}