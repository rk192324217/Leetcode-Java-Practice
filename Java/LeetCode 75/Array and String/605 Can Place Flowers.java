class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean l=false,r=false;
        int count=0,len=flowerbed.length;
        for(int i=0;i<len;i++){
            l=(i==0 || flowerbed[i-1]==0);
            r=(i==len-1 || flowerbed[i+1]==0);
            if(flowerbed[i]==0){
                if(l && r){
                    flowerbed[i]=1;
                    count++;
                }
            }
            if(count>=n)return true;
        }
        return false;
    }
}