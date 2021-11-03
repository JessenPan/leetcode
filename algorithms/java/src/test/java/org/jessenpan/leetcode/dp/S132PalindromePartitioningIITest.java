package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S132PalindromePartitioningIITest {

    private S132PalindromePartitioningII palindromePartitioningII = new S132PalindromePartitioningII();

    @Test
    public void test1() {
        int t = palindromePartitioningII.minCut("aab");
        Assert.assertEquals(1, t);
    }


    @Test
    public void test2() {
        int t = palindromePartitioningII.minCut("a");
        Assert.assertEquals(0, t);
    }

}
