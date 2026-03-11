class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i =0 ; i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                int tempSum=nums[i]+nums[j];
                if (tempSum==target){
                    
                    return new int[] {i,j};
                }

            }
        }
        return new int[] {};
    }
}
// revised on 27.02.2026

//new method learned using hashmap on 11.03.2026
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> holder=new HashMap<>();
        int comple;
        for(int i=0;i<nums.length;i++){
            comple=target-nums[i];
            if(holder.containsKey(comple)){
                return new int[]{i,holder.get(comple)};
            }
            holder.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}