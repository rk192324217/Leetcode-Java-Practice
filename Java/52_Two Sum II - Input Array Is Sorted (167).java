class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int sum=0;
        while (l<r){
            sum=nums[l]+nums[r];
            if(sum==target){return new int[]{l+1,r+1};}
            else if(sum>target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}