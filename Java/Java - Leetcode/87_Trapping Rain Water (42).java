class Solution {
    public int trap(int[] height) {
        int leftmax=0, rightmax=0, left=0, right=height.length-1,maximumraindrop=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                    maximumraindrop+=(leftmax-height[left]);
                }
                left++;
            }
            else{
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }
                else{
                    maximumraindrop+=(rightmax-height[right]);
                }
                right--;

            }
        }
        return maximumraindrop;
    }
}