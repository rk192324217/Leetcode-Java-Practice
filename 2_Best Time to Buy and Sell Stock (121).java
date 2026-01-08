class Solution {
    public int maximum(int num1 , int num2){
        if (num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }
    public int maxProfit(int[] prices) {
        int res=0;
        int price = prices[0];

        for (int i =1 ; i<prices.length;i++){
            if(prices[i]<price){
                price=prices[i];
            }
            res=maximum(res,prices[i]-price);
        }
        return res;
    }

}