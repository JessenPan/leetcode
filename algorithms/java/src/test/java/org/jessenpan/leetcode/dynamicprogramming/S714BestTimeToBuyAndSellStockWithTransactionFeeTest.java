package org.jessenpan.leetcode.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S714BestTimeToBuyAndSellStockWithTransactionFeeTest {

    private S714BestTimeToBuyAndSellStockWithTransactionFee bestTimeToBuyAndSellStockWithTransactionFee = new S714BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    public void test1() {
        int v = bestTimeToBuyAndSellStockWithTransactionFee.maxProfit(new int[] { 1, 3, 2, 8, 4, 9 }, 2);
        Assert.assertEquals(8, v);
    }

}
