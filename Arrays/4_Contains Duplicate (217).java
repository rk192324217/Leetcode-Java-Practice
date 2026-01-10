class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numericals=new HashSet<>();
        for (int i :nums){
            if (numericals.contains(i)){
                return true;
            }
            numericals.add(i);
        }
        return false;
    }
}
