class Solution {
    public int numberOfSpecialChars(String word) {
        int lower[]=new int[26];
        int upper[]=new int[26];
        int count=0;
        char current;
        for(char i=0;i<word.length();i++){
            // System.out.print(word.charAt(i));
            current=word.charAt(i);
            if(current>='a'&&current<='z'){
                lower[current-'a']++;
            }
            else{
                upper[current-'A']++;
            }
        }
        for(int i =0;i<26;i++){
            if(upper[i]>=1 && lower[i]>=1){
                count++;
            }
        }
        return count;
    }
}