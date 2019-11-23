package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S123BestTimeToBuyAndSellStockIIITest {

    private S123BestTimeToBuyAndSellStockIII bestTimeToBuyAndSellStockIII = new S123BestTimeToBuyAndSellStockIII();

    @Test
    public void test1() {
        int p = bestTimeToBuyAndSellStockIII.maxProfit(new int[] { 3, 3, 5, 0, 0, 3, 1, 4 });
        Assert.assertEquals(6, p);
    }

    @Test
    public void test2() {
        int p = bestTimeToBuyAndSellStockIII.maxProfit(new int[] { 1, 2, 3, 4, 5 });
        Assert.assertEquals(4, p);
    }

    @Test
    public void test3() {
        int p = bestTimeToBuyAndSellStockIII.maxProfit(new int[] { 7, 6, 4, 3, 1 });
        Assert.assertEquals(0, p);
    }

}
