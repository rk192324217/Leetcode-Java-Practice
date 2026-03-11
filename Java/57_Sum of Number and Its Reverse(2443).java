class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i = num;i>=0;i--){
            if(i+reverseNum(i)==num){
                System.out.println(i);
                return true;
            }
        }
        return false;
    }
    public int reverseNum(int num){
        int reverse=0;
        while(num!=0){
            reverse=(reverse*10)+(num%10);
            num/=10;
        }
        return reverse;
    }
}