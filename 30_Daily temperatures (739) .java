class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk=new Stack<>();
        int n=temperatures.length;
        int answer[]=new int[n];
        for (int i=0 ;i<n;i++){
            while(!stk.isEmpty() && temperatures[i]>temperatures[stk.peek()]){
                int idx=stk.pop();
                answer[idx]=i-idx;
            }
            stk.push(i);
        }
        return answer;
    }
}