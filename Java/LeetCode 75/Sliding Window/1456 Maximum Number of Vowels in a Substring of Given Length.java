
class Solution {    
    public int maxVowels(String s, int k) {
        int count =0,res=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))count++;
        }
        res=count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i)))count++;
            if(isVowel(s.charAt(i-k)))count--;
            res=(res>count)?res:count;
        }
        return res;
    }
    public boolean isVowel(char x){
        if(x == 'a' ||x == 'e' ||x == 'i' ||x == 'o' ||x == 'u' ||x == 'A' ||x == 'E' ||x == 'I' ||x == 'O' ||x == 'U'){
            return true;
        }
        return false;
    }
}