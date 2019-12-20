package org.jessenpan.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S846HandOfStraightsTest {

    private S846HandOfStraights handOfStraights = new S846HandOfStraights();

    @Test
    public void test1() {
        boolean b = handOfStraights.isNStraightHand(new int[] { 1, 2, 3, 6, 2, 3, 4, 7, 8 }, 3);
        Assert.assertTrue(b);
    }

    @Test
    public void test2() {
        boolean b = handOfStraights.isNStraightHand(new int[] { 1, 2, 3, 4, 5 }, 4);
        Assert.assertFalse(b);
    }

    @Test
    public void test3() {
        boolean b = handOfStraights.isNStraightHand(new int[] { 1, 1, 2, 2, 3, 3 }, 2);
        Assert.assertFalse(b);
    }
}
