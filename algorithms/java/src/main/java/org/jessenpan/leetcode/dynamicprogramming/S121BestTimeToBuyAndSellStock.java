package org.jessenpan.leetcode.dynamicprogramming;

/**
 * @author jessenpan
 * tag:dynamicprogramming
 * 
 * maxProfit(n)=max(maxProfit(n-1),prices[n]-minPrice[i])  其中:0<=i<=n-1  
 */
public class S121BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int lastProfit = 0, minPrice = prices[0];
        int length = prices.length;
        for (int i = 1; i < length; i++) {
            lastProfit = Math.max(lastProfit, prices[i] - minPrice);
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
        }
        return lastProfit;
    }

}
