package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S122BestTimeToBuyAndSellStockIITest {

    private S122BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new S122BestTimeToBuyAndSellStockII();

    @Test
    public void test1() {
        int profit = bestTimeToBuyAndSellStockII.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });
        Assert.assertEquals(7, profit);
    }

    @Test
    public void test2() {
        int profit = bestTimeToBuyAndSellStockII.maxProfit(new int[] { 1, 2, 3, 4, 5 });
        Assert.assertEquals(4, profit);
    }

    @Test
    public void test3() {
        int profit = bestTimeToBuyAndSellStockII.maxProfit(new int[] { 7, 6, 4, 3, 1 });
        Assert.assertEquals(0, profit);
    }

    @Test
    public void test4() {
        int profit = bestTimeToBuyAndSellStockII.maxProfit(new int[] { 6, 1, 3, 2, 4, 7 });
        Assert.assertEquals(7, profit);
    }

}
