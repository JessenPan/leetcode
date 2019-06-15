package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.dynamicprogramming.S583DeleteOperationForTwoStrings;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S583DeleteOperationForTwoStringsTest {

    private S583DeleteOperationForTwoStrings deleteOperationForTwoStrings = new S583DeleteOperationForTwoStrings();

    @Test
    public void test1() {
        int distance = deleteOperationForTwoStrings.minDistance("sea", "eat");
        Assert.assertEquals(2, distance);
    }

    @Test
    public void test2() {
        int distance = deleteOperationForTwoStrings.minDistance("amm", "cdm");
        Assert.assertEquals(4, distance);
    }

    @Test
    public void test3() {
        int distance = deleteOperationForTwoStrings.minDistance("sea", "ate");
        Assert.assertEquals(4, distance);
    }

}
