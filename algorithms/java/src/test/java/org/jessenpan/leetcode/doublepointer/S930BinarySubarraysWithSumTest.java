package org.jessenpan.leetcode.doublepointer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S930BinarySubarraysWithSumTest {

    private S930BinarySubarraysWithSum binarySubarraysWithSum = new S930BinarySubarraysWithSum();

    @Test
    public void test1() {
        int cnt = binarySubarraysWithSum.numSubarraysWithSum(new int[] { 1, 0, 1, 0, 1 }, 2);
        Assert.assertEquals(4, cnt);
    }

}
