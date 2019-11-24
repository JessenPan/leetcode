package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S506RelativeRanksTest {

    private S506RelativeRanks relativeRanks = new S506RelativeRanks();

    @Test
    public void test1() {
        String[] ranks = relativeRanks.findRelativeRanks(new int[] { 5, 4, 3, 2, 1 });
        Assert.assertArrayEquals(new String[] { "Gold Medal", "Silver Medal", "Bronze Medal", "4", "5" }, ranks);
    }

}
