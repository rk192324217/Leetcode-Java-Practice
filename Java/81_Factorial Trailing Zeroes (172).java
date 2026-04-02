class Solution {
    public int trailingZeroes(int n) {
        if (n<5) return 0;
        int res=0;
        int mul=5;
        while(n >=mul){
            res+=n/mul;
            mul*=5;
        }
        return res;
    }
}