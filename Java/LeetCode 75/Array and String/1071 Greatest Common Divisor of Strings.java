class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!equalStrings((str2+str1),(str1+str2))) return "";
        String res=getSubstring(str1,gcd(str1.length(),str2.length()));
        return res;
    }
    private Boolean equalStrings(String str1,String str2){
        for (int i =0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) return false;
        }
        return true;
    }
    private String getSubstring(String s, int length){
        StringBuilder res=new StringBuilder();
        for(int i=0;i<length;i++){
            res.append(s.charAt(i));
        }
        return res.toString();
    }
    private int gcd(int x,int y){
        int temp=0;
        while(y!=0){
            temp=x%y;
            x=y;
            y=temp;
        }
        return x;
    }
}