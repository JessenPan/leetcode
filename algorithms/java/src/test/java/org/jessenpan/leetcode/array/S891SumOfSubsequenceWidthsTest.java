package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S891SumOfSubsequenceWidthsTest {

    private S891SumOfSubsequenceWidths sumOfSubsequenceWidths = new S891SumOfSubsequenceWidths();

    @Test
    public void test1() {
        int v = sumOfSubsequenceWidths.sumSubseqWidths(new int[] { 2, 1, 3 });
        Assert.assertEquals(6, v);
    }

}
