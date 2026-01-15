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