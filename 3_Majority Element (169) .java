// Boyer–Moore Voting Algorithm.
//Here we cancle th e count if some other element comes then at the end if we see through it the majority element never gets cancelled and will present the end also 

class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int i:nums){
            if(count==0){
                candidate=i;
            }
            if(candidate==i){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        return candidate;


        
        // for (int i =0;i<nums.length-1;i++){
        //     for (int j =i+1 ; j<nums.length;j++){
        //         if (nums[i]>nums[j]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }

        //     }
        // }
        // return nums[nums.length/2];
    }
}