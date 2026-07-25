class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowels= new ArrayList<>();
        StringBuilder res= new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                vowels.add(s.charAt(i));
            }
        }
        int k = vowels.size()-1;
        for(int i =0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                res.append(vowels.get(k--));
                continue;
            }
            res.append(s.charAt(i));
        }
        return res.toString();

    }
    public boolean isvowel(Character a){
        if( a == 'a' ||  a == 'e' ||  a == 'i' ||  a == 'o' ||  a == 'u' ||  a == 'A' ||  a == 'E' ||  a == 'I' ||  a == 'O' ||  a == 'U'){
            return true;
        }
        return false;
    }
}