class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1=0, l2=0;
        while(l1 < t.length() && l2<s.length()){
            if(t.charAt(l1)==s.charAt(l2)){
                
                l2++;
            }
            l1++;
        }
        return l2==s.length();
    }
}