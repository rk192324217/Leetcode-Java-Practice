class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0){return 0;}
        Stack<Integer> stk= new Stack<>();
        int num=0,sign='+',indx=0;;
        for(char i : s.toCharArray()){
            if(i>='0' && i<='9'){
                num=num*10+(i-'0');
            }
            if((i!=' ' && !(i>='0' && i<='9') ) || indx==s.length()-1){
                if(sign=='+'){
                    stk.push(num);
                }
                if(sign=='-'){
                    stk.push(-num);
                }
                if(sign=='*'){
                    stk.push(stk.pop()*num);
                }
                if(sign=='/'){
                    stk.push(stk.pop()/num);
                }
                sign=i;
                num=0;
            }
            indx++;
        }
        int res=0;
        for(int i : stk){
            res+=i;
        }
        return res;
    }
}