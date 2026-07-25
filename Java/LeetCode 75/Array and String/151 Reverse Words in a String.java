class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        int i =s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){i--;}
            if(i<0){break;}
            int end=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            if(res.length()>0){res.append(' ');}
            res.append(Substring(i+1,end,s));
            
        }
        return res.toString();
    }
    public String Substring(int f,int l,String s){
        StringBuilder substr=new StringBuilder();
        for(int i =f;i<=l;i++){
            substr.append(s.charAt(i));
        }
        return substr.toString(); 
        
    }
}