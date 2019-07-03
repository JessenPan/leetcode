package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S128LongestConsecutiveSequenceTest {

    private S128LongestConsecutiveSequence longestConsecutiveSequence = new S128LongestConsecutiveSequence();

    @Test
    public void test1() {
        int max = longestConsecutiveSequence.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 });
        Assert.assertEquals(4, max);
    }

}
