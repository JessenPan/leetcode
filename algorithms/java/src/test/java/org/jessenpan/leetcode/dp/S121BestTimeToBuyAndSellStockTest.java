package org.jessenpan.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S121BestTimeToBuyAndSellStockTest {

    private S121BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new S121BestTimeToBuyAndSellStock();

    @Test
    public void test1() {
        int maxProfit = bestTimeToBuyAndSellStock.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });
        assertEquals(5, maxProfit);
    }

    @Test
    public void test2() {
        int maxProfit = bestTimeToBuyAndSellStock.maxProfit(new int[] { 7, 6, 5, 4, 3, 2, 1 });
        assertEquals(0, maxProfit);
    }

    @Test
    public void test3() {
        int maxProfit = bestTimeToBuyAndSellStock.maxProfit(new int[] { });
        assertEquals(0, maxProfit);
    }

}
