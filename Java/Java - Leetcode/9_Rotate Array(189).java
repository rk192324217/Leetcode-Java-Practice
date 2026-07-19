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
// 11.03.2026
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n=nums.length;
//         k= k % n;
//         reverse(nums,0,n-1);
//         reverse(nums,0,k-1);
//         reverse(nums,k,n-1);
//     }
//     public void reverse(int[] nums, int left, int right){
//         int temp;
//         while(left<right){
//             temp=nums[left];
//             nums[left++]=nums[right];
//             nums[right--]=temp;
//         }
//     }
// }