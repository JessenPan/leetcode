package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S309BestTimeToBuyAndSellStockWithCooldownTest {

    private S309BestTimeToBuyAndSellStockWithCooldown bestTimeToBuyAndSellStockWithCooldown = new S309BestTimeToBuyAndSellStockWithCooldown();

    @Test
    public void test1() {
        int v = bestTimeToBuyAndSellStockWithCooldown.maxProfit(new int[] { 1, 2, 3, 0, 2 });
        Assert.assertEquals(3, v);
    }

}
