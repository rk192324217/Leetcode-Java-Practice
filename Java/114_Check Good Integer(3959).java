class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0;
        int squareSum=0;
        int lastDigit=0;
        while(n>0){
            lastDigit=n%10;
            digitSum+=lastDigit;
            squareSum+=(lastDigit*lastDigit);
            n/=10;
        }
        return (squareSum-digitSum)>=50;
    }
}