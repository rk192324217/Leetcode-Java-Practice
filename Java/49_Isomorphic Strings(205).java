class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> sCharCount=new HashMap<>();
        HashMap<Character,Integer> tCharCount=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!sCharCount.containsKey(s.charAt(i))){
                sCharCount.put(s.charAt(i),i);
            }
            if(!tCharCount.containsKey(t.charAt(i))){
                tCharCount.put(t.charAt(i),i);
            }
            if(!sCharCount.get(s.charAt(i)).equals(tCharCount.get(t.charAt(i)))){
                return false;
            }
            
        }
        return true;
    }
}