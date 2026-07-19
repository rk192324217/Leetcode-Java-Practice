class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> res= new ArrayList<>();
        if(n==0) return res;
        int start=nums[0];
        for(int i = 1 ; i< n; i++){
            if(nums[i-1] != nums[i]-1){
                if(start==nums[i-1]){
                    res.add(String.valueOf(start));
                }else{
                    res.add(String.format("%d->%d",start,nums[i-1]));
                }
                start=nums[i];
            }
        }
        if(start==nums[nums.length-1]){
            res.add(String.valueOf(start));
        }
        else{
            res.add(String.format("%d->%d",start,nums[n-1]));
        }

        return res;
    }
}