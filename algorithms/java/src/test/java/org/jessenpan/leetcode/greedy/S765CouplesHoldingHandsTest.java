package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S765CouplesHoldingHandsTest {

    private S765CouplesHoldingHands couplesHoldingHands = new S765CouplesHoldingHands();

    @Test
    public void test1() {
        int t = couplesHoldingHands.minSwapsCouples(new int[] { 0, 2, 1, 3 });
        Assert.assertEquals(1, t);
    }

    @Test
    public void test2() {
        int t = couplesHoldingHands.minSwapsCouples(new int[] { 3, 2, 0, 1 });
        Assert.assertEquals(0, t);
    }

}
