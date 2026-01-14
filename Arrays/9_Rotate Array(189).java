class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        int rotations=k%length;
        int[] res=new int[length];
        int index=0;
        for (int i=length-rotations;i<length;i++){
            res[index++]=nums[i];
        }
        for (int j=0 ; j<length-rotations;j++){
            res[index++]=nums[j];
        }
        for (int r=0;r<length;r++){
            nums[r]=res[r];
        }
    }
}