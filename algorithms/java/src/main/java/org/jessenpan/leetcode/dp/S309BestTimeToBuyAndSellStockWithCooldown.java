package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S309BestTimeToBuyAndSellStockWithCooldown {

    public int maxProfit(int[] prices) {

        int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
        int last_dp_i_0 = 0;
        for (int price : prices) {
            int swap = dp_i_0;
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + price);
            dp_i_1 = Math.max(dp_i_1, last_dp_i_0 - price);
            last_dp_i_0 = swap;
        }
        return dp_i_0;
    }

}
