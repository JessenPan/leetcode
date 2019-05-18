package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S131PalindromePartitioning;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S131PalindromePartitioningTest {

    private S131PalindromePartitioning palindromePartitioning = new S131PalindromePartitioning();

    @Test
    public void test1() {
        List<List<String>> palindromes = palindromePartitioning.partition("aab");
        Assert.assertEquals(Arrays.asList(Arrays.asList("aa", "b"), Arrays.asList("a", "a", "b")), palindromes);
    }

}
