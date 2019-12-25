package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S377CombinationSumIVTest {

    private S377CombinationSumIV combinationSumIV = new S377CombinationSumIV();

    @Test
    public void test1() {
        int t = combinationSumIV.combinationSum4(new int[] { 1, 2, 3 }, 4);
        Assert.assertEquals(7, t);
    }

}
