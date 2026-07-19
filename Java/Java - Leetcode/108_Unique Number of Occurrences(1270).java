class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> count= new HashMap<>();
        for(int i : arr){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        HashSet<Integer> seen=new HashSet<>();
        for(int j:count.keySet()){
            if (seen.contains(count.get(j)))return false;
            seen.add(count.get(j));
        }
        return true;
    }
}