class Solution {
    public int getNext(int n){
        int res=0;
        while(n!=0){
            int digit= n%10;
            res+=digit*digit;
            n/=10;
        }
        return res;
    }
    public boolean isHappy(int n) {
        Set<Integer> visit=new HashSet<>();
        while(!visit.contains(n)){
            visit.add(n);
            n=getNext(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
}