class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax=0,currMin=0,total=0,maxSum=nums[0],minSum=nums[0];
        for(int i:nums){
            currMax=Math.max(currMax+i,i);
            currMin=Math.min(currMin+i,i);
            maxSum=Math.max(currMax,maxSum);
            minSum=Math.min(currMin,minSum);
            total+=i;
        }
        return maxSum> 0 ? Math.max(maxSum,(total-minSum)) : maxSum;
    }
}