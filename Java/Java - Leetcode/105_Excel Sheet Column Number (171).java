class Solution {
    public int titleToNumber(String s) {
        long ans=0;
        char c=s.charAt(0);
        for(int i =0 ; i < s.length() ; i++){
            c=s.charAt(i);
            ans= ans*26 + (c-'A' + 1);
        }
        return (int)ans;
    }
}