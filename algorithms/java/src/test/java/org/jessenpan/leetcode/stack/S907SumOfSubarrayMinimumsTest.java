package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S907SumOfSubarrayMinimumsTest {

    private S907SumOfSubarrayMinimums sumOfSubarrayMinimums = new S907SumOfSubarrayMinimums();

    @Test
    public void test1() {
        int t = sumOfSubarrayMinimums.sumSubarrayMins(new int[] { 3, 1, 2, 4 });
        Assert.assertEquals(17, t);
    }

}
