// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int [] res=new int[nums.length];
//         for (int i=0 ;i<nums.length;i++){
//             res[i]=(nums[i] * nums[i]);
//         }
//         Arrays.sort(res);
//         return res;
//     }
// }
class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int left=0, right= nums.length-1;
        int leftSqr,rightSqr;
        for(int i=nums.length-1; i>=0; i--){
            leftSqr=nums[left]*nums[left];
            rightSqr=nums[right]*nums[right];
            if(leftSqr > rightSqr){
                res[i]=leftSqr;
                left++;
            }
            else{
                res[i]=rightSqr;
                right--;
                }
        }
        return res;
    }
}