class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int resArea=0;
        int r=n-1, l=0,height_area=0,width=0,area=0;
        while(l<r){
            height_area=Math.min(height[l],height[r]);
            width=r-l;
            area=height_area*width;
            resArea=Math.max(resArea,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return resArea;
        }

    }
