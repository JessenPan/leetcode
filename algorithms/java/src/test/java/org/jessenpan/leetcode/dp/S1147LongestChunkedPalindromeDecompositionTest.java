package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1147LongestChunkedPalindromeDecompositionTest {

    private S1147LongestChunkedPalindromeDecomposition longestChunkedPalindromeDecomposition = new S1147LongestChunkedPalindromeDecomposition();

    @Test
    public void test1() {
        int t = longestChunkedPalindromeDecomposition.longestDecomposition("ghiabcdefhelloadamhelloabcdefghi");
        Assert.assertEquals(7, t);
    }

    @Test
    public void test2() {
        int t = longestChunkedPalindromeDecomposition.longestDecomposition("merchant");
        Assert.assertEquals(1, t);
    }

    @Test
    public void test3() {
        int t = longestChunkedPalindromeDecomposition.longestDecomposition("antaprezatepzapreanta");
        Assert.assertEquals(11, t);
    }

    @Test
    public void test4() {
        int t = longestChunkedPalindromeDecomposition.longestDecomposition("aaa");
        Assert.assertEquals(3, t);
    }

}
