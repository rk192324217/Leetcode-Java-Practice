// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first=-1,last=-1;
//         for(int i =0 ; i< nums.length;i++){
//             if(nums[i]==target){
//                 if(first==-1){
//                     first=i;
//                 }
//                 last=i;
//             }
//         }
//         return new int[]{first,last};
//     }
// }


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1,last=-1;
        first=binarySearch(target, nums,true);
        last=binarySearch(target, nums,false);       
        return new int[]{first,last};
    }
    public int binarySearch(int target , int[]nums, boolean isLeft){
        int left=0,right=nums.length-1,indx=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }
            else if (nums[mid]<target){left=mid+1;}
            else{
                indx=mid;
                if(isLeft){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }

        }
        return indx;


    }

}