class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0, r=s.length()-1;
        char arr[]=s.toCharArray();
        char temp=arr[l];

        while(l<r){
            while(l<r && !isletter(arr[l])){l++;}
            while(l<r && !isletter(arr[r])){r--;}
                temp=arr[l];
                arr[l++]=arr[r];
                arr[r--]=temp;
        }
        return new String (arr);
    }
    public boolean isletter(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}   