class Solution {
    public int reverse(int num) {
        int temp=num;
        long res=0;
        while(temp!=0){
            res=(res*10)+(temp%10);
            temp=temp/10;
        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE ){return 0;}
        return (int) res;
    }
}