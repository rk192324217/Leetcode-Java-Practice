class Solution {
    public int maximumCount(int[] nums) {
        int negCount=0,posCount=0;
        for(int i:nums){
            if(i<0){
                negCount++;
            }
            else if (i>0){
                posCount++;
            }
        }
        return Math.max(negCount,posCount);
    }
}