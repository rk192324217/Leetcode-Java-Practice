class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenidx=0, oddidx=1;
        int res[]=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[evenidx]=nums[i];
                evenidx+=2;
            }
            else {
                res[oddidx]=nums[i];
                oddidx+=2;
            }
        }
        return res;
    }
}