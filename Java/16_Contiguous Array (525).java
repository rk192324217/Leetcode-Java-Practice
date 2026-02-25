class Solution {
    public int findMaxLength(int[] nums) {       
        Map<Integer,Integer> mp=new HashMap<>();
        int prefixSum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+= nums[i] == 0 ? -1 : 1 ;
            if(prefixSum==0){
                res=i+1;
            }
            else if(mp.containsKey(prefixSum)){
                res=Math.max(res,i-mp.get(prefixSum));
            }
            else{
                mp.put(prefixSum,i);
            }
        }
        return res;

    }
}