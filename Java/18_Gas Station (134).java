class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0 , totGas=0 ,totCost=0, remaining=0;
        for (int i =0;i<gas.length;i++){
            totGas+=gas[i];
            totCost+=cost[i];
            remaining+=gas[i]-cost[i];
            if(remaining < 0){
                start=i+1;
                remaining=0;
            }
        }
        return totGas>=totCost?start:-1;
    }
}