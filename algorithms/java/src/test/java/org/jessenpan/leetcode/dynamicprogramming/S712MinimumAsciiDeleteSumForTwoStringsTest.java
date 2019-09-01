package org.jessenpan.leetcode.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S712MinimumAsciiDeleteSumForTwoStringsTest {

    private S712MinimumAsciiDeleteSumForTwoStrings minimumAsciiDeleteSumForTwoStrings = new S712MinimumAsciiDeleteSumForTwoStrings();

    @Test
    public void test1() {
        int t = minimumAsciiDeleteSumForTwoStrings.minimumDeleteSum("sea", "eat");
        Assert.assertEquals(231, t);
    }

    @Test
    public void test2() {
        int t = minimumAsciiDeleteSumForTwoStrings.minimumDeleteSum("delete", "leet");
        Assert.assertEquals(403, t);
    }

}
