class Solution {
    public int removeElement(int[] nums, int val) {
        int n =nums.length;
        int resLen=n;
        int left=0;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                resLen--;
            }
            else{
                nums[left]=nums[i];
                left++;
            }
        }
        return resLen;
    }
}