class Solution {
    public int longestOnes(int[] nums, int k) {
        int end=0,start=0,zero=0;
        while(end<nums.length){
            if(nums[end++]==0)zero++;
            if(zero>k){
                if(nums[start++]==0)zero--;
            }
        }
        return end-start;
    }
}