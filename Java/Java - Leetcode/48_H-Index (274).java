class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] count=new int[n+1];
        for(int i:citations){
            if(i>=n){count[n]++;}
            else{count[i]++;}
        }
        int total=0;
        for(int i=n;i>=0;i--){
            total+=count[i];
            if(i<=total){
                return i;
            }
            
        }
        return 0;
       
       
        // int n=citations.length;
        // Arrays.sort(citations);
        // for(int i=0;i<n;i++){
        //     if(citations[i]>=n-i){
        //         return n-i;
        //     }
        // }
        // return 0;
    }
}