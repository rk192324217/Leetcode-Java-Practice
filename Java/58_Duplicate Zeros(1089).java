class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res=new int[arr.length];
        int i=0,k=0;
        while(i<arr.length && k<arr.length){
            res[i++]=arr[k];
            if(arr[k]==0 && i<arr.length){
                res[i++]=0;
            }
            k++;
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=res[j];
        }
    }
}