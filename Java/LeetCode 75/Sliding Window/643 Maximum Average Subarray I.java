// EFFICIENT APPROACH SLIDING WINDOW
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currentMax=0,res;
        for(int i =0;i<k;i++){
            currentMax+=nums[i];
        }
        res=currentMax;
        for(int i=k;i<nums.length;i++){
            currentMax+=(nums[i]-nums[i-k]);
            res=(currentMax >res)? currentMax:res;
        }
        return res/k;
    }

}

// BRUTE FORCE APPROACH
// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         int i=0,j=k-1;
//         double average=0,res=-Double.MAX_VALUE;
//         while(j<nums.length){
//             average=sum(nums,i,j)/k;
//             res= (res>average)?res:average;
//             i++;j++;
//         }
//         return res;
//     }
//     public double sum(int[]nums, int i, int j){
//         double res=0;
//         for(int x=i;x<=j;x++){
//             res+=nums[x];
//         }
//         return res;
//     }

// }

