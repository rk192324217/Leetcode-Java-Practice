class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        freq.put(0,1);
        int sum=0,count=0;
        for(int i:nums){
            sum+=i;
            if(freq.containsKey(sum-k)){
                count+=freq.get(sum-k);
            }
            freq.put(sum,(freq.getOrDefault(sum,0)+1));
        }
        return count;
    }
}