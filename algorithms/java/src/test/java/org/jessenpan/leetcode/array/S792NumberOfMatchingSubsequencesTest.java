package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S792NumberOfMatchingSubsequencesTest {

    private S792NumberOfMatchingSubsequences numberOfMatchingSubsequences = new S792NumberOfMatchingSubsequences();

    @Test
    public void test1() {
        int num = numberOfMatchingSubsequences.numMatchingSubseq("abcde", new String[] { "a", "bb", "acd", "ace" });
        Assert.assertEquals(3, num);
    }

}
