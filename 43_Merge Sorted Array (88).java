class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        int[] res=new int[m+n];
        int indx=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                res[indx++]=nums2[j++];
            }
            else{
                res[indx++]=nums1[i++];
            }
            
        }
        while(i<m){
            res[indx++]=nums1[i++];
        }
        while(j<n){
            res[indx++]=nums2[j++];
        }

        for(int k=0;k<m+n;k++){
            nums1[k]=res[k];
        }
        
    }
}