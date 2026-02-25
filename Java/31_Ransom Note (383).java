class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> table=new HashMap<>();
        for(char i :magazine.toCharArray()){
           
            table.put(i,table.getOrDefault(i,0)+1);
        }
        for (char i:ransomNote.toCharArray()){
             if(!table.containsKey(i) || table.get(i)<=0) return false;
            table.put(i,table.get(i)-1);
        }
        return true;
    }
}