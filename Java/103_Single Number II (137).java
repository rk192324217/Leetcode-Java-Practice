class Solution {
    public int singleNumber(int[] nums) {
        int ones=0,twos=0;
        for(int i : nums){
            ones^=(i&~twos);
            twos^=(i&~ones);
        }
        return ones;
    }
}