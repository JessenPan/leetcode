package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S122BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int len = prices.length;

        int j = 0;

        while (j < len - 1) {
            if (prices[j] > prices[j + 1]) {
                j++;
                continue;
            }
            for (int k = j + 1; k < len; k++) {
                if (k == (len - 1)) {
                    maxProfit += prices[len - 1] - prices[j];
                    j = len - 1;
                    break;
                }
                if (prices[k] < prices[k + 1]) {
                    continue;
                }
                maxProfit += prices[k] - prices[j];
                j = k + 1;
                break;
            }
        }

        return maxProfit;
    }

}
