/*class Solution {
    public int distributeCandies(int[] candy) {
        Arrays.sort(candy);
        int count=1;
        for(int i=1;i<candy.length;i++){
            if(candy[i]!=candy[i-1]){
                count++;
            }
        }
        return count>candy.length/2 ? candy.length/2 : count;
    }
}*/

// class Solution {
    public int distributeCandies(int[] candy) {
        int n=candy.length;
        int count=0;
        HashMap<Integer,Integer> counter= new HashMap<>();
        for(int i : candy){
            if(!counter.containsKey(i)){
                counter.put(i,1);
                count++;
            }
            if(count==n/2){
                break;
            }
        }
        return count;

    }
}