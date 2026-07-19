class Solution {
    public int addDigits(int num) {
        int r;
        while(num>9){
            r=0;
            while(num>0){
                r+=num%10;
                num/=10;
            }
            num=r;
        }
        return num;
        // return 1+(num-1)%9;
    }
}