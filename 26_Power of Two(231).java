class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
        // return n>0 && (Math.log(n)/Math.log(2))%1==0;
    }
}