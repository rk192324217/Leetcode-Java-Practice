class Solution {
    public int findMiddleIndex(int[] nums) {
                int n=nums.length;
        int l=0,r=n-1,leftSum=0,rightSum=0;
        for(int i =0 ; i<n;i++){
            l=0;
            r=n-1;
            leftSum=0;
            rightSum=0;
            while(l<i){
                leftSum+=nums[l++];
            }
            while(r>i){
                rightSum+=nums[r--];
            }
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
}
