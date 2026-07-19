class Solution {
    public int[] replaceElements(int[] nums) {
        int n=nums.length,indx=0,maxi=0;
        int res[]=new int[n];
        if (n<=1){return new int[]{-1};}
        for(int i=0;i<n;i++){
            indx=i+1;
            maxi=-1;
            while(indx<n){
                maxi=Math.max(maxi,nums[indx]);
                indx++;
            }
            res[i]=maxi;
        }
        return res;
    }
}