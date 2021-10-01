/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * link：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 */
public class SellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > diff) {
                diff = prices[i] - min;
            }
        }
        return diff;
    }
}