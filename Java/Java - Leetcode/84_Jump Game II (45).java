class Solution {
    public int jump(int[] nums) {
        if ( nums.length <= 1) return 0;
        int count=0, farthest=0, currentend=0;
        for(int i = 0; i<nums.length;i++){
            farthest= farthest>i+nums[i] ? farthest : i+nums[i];

            if(i==currentend){
                count++;
                currentend=farthest;
                if(currentend >= nums.length-1) break;

            }
        }
        return count++;
    }
}