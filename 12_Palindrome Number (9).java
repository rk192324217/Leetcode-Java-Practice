class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){return false;}
        int newNum=0;
        int temp=x;
        while(temp!=0){
            int rem = temp%10;
            newNum=newNum*10+rem;
            temp/=10;
        }
        if (newNum!=x){return false;}
        return true;
    }
}