class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr=new int[nums.length];
        for (int i:nums){
            if(arr[i]==1){
                return i;
            }
            arr[i]+=1;
        }
        return -1;
    }
}