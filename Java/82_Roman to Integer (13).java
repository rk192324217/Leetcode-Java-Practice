class Solution {
    public int romanToInt(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int curr=value(s.charAt(i));
            if(i<s.length()-1 && curr< value(s.charAt(i+1))){
                res-=curr;
            }
            else{
                res+=curr;
            }
        }
        return res;
        
    }
    public int value(char c){
        if(c=='I')return 1;
        if(c=='V')return 5;
        if(c=='X')return 10;
        if(c=='L')return 50;
        if(c=='C')return 100;
        if(c=='D')return 500;
        if(c=='M')return 1000;
        return 0;
    }
}