class Solution {
    public int[] plusOne(int[] nums) {
        for(int i=nums.length-1; i >=0 ; i--){
            if(nums[i]+1 != 10 ){
                nums[i]+=1;
                return nums;
            }
            nums[i]=0;
        }
        int newarr[]=new int[nums.length+1];
        newarr[0]=1;
        return newarr;
    }
}