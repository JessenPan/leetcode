package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S718MaximumLengthOfRepeatedSubarrayTest {

    private S718MaximumLengthOfRepeatedSubarray maximumLengthOfRepeatedSubarray = new S718MaximumLengthOfRepeatedSubarray();

    @Test
    public void test1() {
        int t = maximumLengthOfRepeatedSubarray.findLength(new int[] { 1, 2, 3, 2, 1 }, new int[] { 3, 2, 1, 4, 7 });
        Assert.assertEquals(3, t);
    }

}
