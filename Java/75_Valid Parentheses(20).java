class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        char c=s.charAt(0), top=s.charAt(0);
        for(int i =0 ; i < s.length() ; i++ ){
            c=s.charAt(i);
            if(c=='(' || c=='{'||c=='['){
                stk.push(c);
            }
            else{
                if(stk.isEmpty())return false;
                top=stk.pop();
                if(c==')' && top!='(')return false;
                if(c=='}' && top!='{')return false;
                if(c==']' && top!='[')return false;
            }
        }
        return stk.isEmpty();
    }
}