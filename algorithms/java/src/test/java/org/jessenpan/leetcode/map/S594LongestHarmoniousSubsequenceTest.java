package org.jessenpan.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S594LongestHarmoniousSubsequenceTest {

    private S594LongestHarmoniousSubsequence longestHarmoniousSubsequence = new S594LongestHarmoniousSubsequence();

    @Test
    public void test1() {
        int maxLen = longestHarmoniousSubsequence.findLHS(new int[] { 1, 3, 2, 2, 5, 2, 3, 7 });
        Assert.assertEquals(5,maxLen);
    }

}
