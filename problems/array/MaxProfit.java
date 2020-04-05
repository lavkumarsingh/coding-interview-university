// https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3287/
public class MaxProfit {
    public static void main(String args[]) {
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            if (diff >= 0) {
                profit = profit + diff;
            }
        }
        return profit;
    }
}