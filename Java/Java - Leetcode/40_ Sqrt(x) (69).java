class Solution {
    public int mySqrt(int x) {
        if(x<2){return x;}
        int i =2;
        while(i<=x/i){
            i+=1;
        }
        return i-1;
    }
}
//revised on 28.04.2026