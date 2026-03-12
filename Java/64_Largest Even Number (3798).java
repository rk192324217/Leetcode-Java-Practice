class Solution {
    public String largestEven(String s) {
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)=='2'){
                break;
            }
            i--;
        }
        if(i<0){return "";}
        String res="";
        for(int j=0;j<i+1;j++){
            res+=s.charAt(j);
        }
        return res;
    }
}