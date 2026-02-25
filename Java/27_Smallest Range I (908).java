class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int maxi=nums[0], mini=nums[0];
        for (int i:nums){
            if(maxi<i){
                maxi=i;
            }
            if(mini>i){
                mini=i;
            }
        }
        if((maxi-mini)-(2*k)<=0 || maxi-mini==0){
            return 0;
        }
        else
        return (maxi-mini)-(2*k);
    }
}