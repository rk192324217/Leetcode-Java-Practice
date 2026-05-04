// class Solution {
//     public int lengthOfLastWord(String s) {
//         int res=0;
//         s=s.trim();
//         for (int i = s.length()-1 ; i>=0;i--){
//             if(s.charAt(i)==' ') break;
//             res++;
//         }
//         return res;
//     }
// }
class Solution {
    public int lengthOfLastWord(String s) {
        int res=0,i=s.length()-1;
        while(0<=i && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            res++;
            i--;
        }
        
        return res;
    }
}