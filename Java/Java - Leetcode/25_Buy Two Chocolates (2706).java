class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int leftover=money-(prices[0]+prices[1]);
        return leftover >= 0 ? leftover : money;
    }
}