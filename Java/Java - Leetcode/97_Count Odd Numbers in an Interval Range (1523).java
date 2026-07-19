class Solution {
    public int countOdds(int low, int high) {
        int res=0,i;
        for(i=low;i<=high;i++){
            if(i%2==1)res+=1;
        }
        return res;
    }
}