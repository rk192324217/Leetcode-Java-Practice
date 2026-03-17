class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int l=0,r=n-1,leftSum=0,rightSum=0;
        for(int i =0 ; i<n ; i++){
            l=0;r=n-1;leftSum=0;rightSum=0;
            while(l<i){
                leftSum+=nums[l++];
            }
            while(r>i){
                rightSum+=nums[r--];
            }
            if(rightSum-leftSum<0){
                res[i]=(rightSum-leftSum)*-1;
            }
            else{
                res[i]=rightSum-leftSum;
            }
        }
        return res;
    }
}