package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1140StoneGameIITest {

    private S1140StoneGameII stoneGameII = new S1140StoneGameII();

    @Test
    public void test1() {
        int s = stoneGameII.stoneGameII(new int[] { 2, 7, 9, 4, 4 });
        Assert.assertEquals(10, s);
    }

}
