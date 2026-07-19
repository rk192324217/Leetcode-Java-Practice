class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int l=0;
        int curSum=0;
        for(int r=0;r<nums.length;r++){
            curSum+=nums[r];
            while(curSum>=target){
                if(r-l+1<min){min=r-l+1;}
                curSum-=nums[l];
                l++;
            }
        }
        return min!= Integer.MAX_VALUE ? min:0 ;}
}