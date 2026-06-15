class Solution {
    public int candy(int[] arr) {
        int n=arr.length,count=0;
        int res[]=new int[n];
        for(int k=0;k<n;k++){
            res[k]=1;
        }
        for(int i =0;i<n-1;i++){
            if(arr[i+1]>arr[i])res[i+1]=res[i]+1;
        }

        for(int j=n-1;j>0;j--){
            if(arr[j]<arr[j-1])  res[j-1]=res[j]+1>res[j-1]?res[j]+1:res[j-1];
        }
        for(int k=0;k<n;k++){
            count+=res[k];
        }
        return count;
    }
}