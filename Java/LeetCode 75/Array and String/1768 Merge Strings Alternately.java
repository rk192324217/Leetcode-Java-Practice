class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s= new StringBuilder();
        int i=0,x=word1.length(), y=word2.length();
        while(i<x || i<y){
            if(i<x){
                s.append(word1.charAt(i));
            }
            if(i<y){
                s.append(word2.charAt(i));
            }
            i++;
        }
        return s.toString();
    }
}