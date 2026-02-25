class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0,n=nums.length;
        int[] result= new int[n-k+1];
        Deque<Integer> toStore= new ArrayDeque<>();
        for (int r = 0 ;r<n;r++){
            if(!toStore.isEmpty() && toStore.peekFirst()<l){
                toStore.pollFirst();
            }
            while(!toStore.isEmpty() && nums[toStore.peekLast() ]<= nums[r]){
                toStore.pollLast();
            }
            toStore.addLast(r);
            if(r-l+1==k){
                result[l++]=nums[toStore.peekFirst()];
            }
        }
        return result;
    }
}