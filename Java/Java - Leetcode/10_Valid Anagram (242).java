class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){return false;}
        char[] chars_s=s.toCharArray();
        char[] chars_t=t.toCharArray();
        Arrays.sort(chars_s);
        Arrays.sort(chars_t);
        for (int i=0;i< s.length();i++){
            if(chars_s[i]!=chars_t[i]){
                return false;
            }
        }
        return true;

    }
}

/*
16.03.2026
Class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}
        int [] charArr=new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for(int i =0 ; i<s.length();i++){
            charArr[s.charAt(i)-'a']++;
            charArr[t.charAt(i)-'a']--;
        }
        for(int i : charArr){
            if(i!=0)return false;
        }
        return true;
    }
}
*/