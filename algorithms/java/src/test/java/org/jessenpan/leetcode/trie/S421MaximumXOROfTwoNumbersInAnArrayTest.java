package org.jessenpan.leetcode.trie;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S421MaximumXOROfTwoNumbersInAnArrayTest {

    private S421MaximumXOROfTwoNumbersInAnArray maximumXOROfTwoNumbersInAnArray = new S421MaximumXOROfTwoNumbersInAnArray();

    @Test
    public void test1() {
        int max = maximumXOROfTwoNumbersInAnArray.findMaximumXOR(new int[] { 3, 10, 5, 25, 2, 8 });
        Assert.assertEquals(28, max);
    }

}
