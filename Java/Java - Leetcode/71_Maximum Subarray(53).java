class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int total=0;
        for(int i:nums){
            if(total<0){
                total=0;
            }
            total+=i;
            maxSum=Math.max(maxSum,total);
        }
        return maxSum;
    }
}