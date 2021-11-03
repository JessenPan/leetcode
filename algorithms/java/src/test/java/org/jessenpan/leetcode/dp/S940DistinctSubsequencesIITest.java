package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S940DistinctSubsequencesIITest {

    private S940DistinctSubsequencesII distinctSubsequencesII = new S940DistinctSubsequencesII();

    @Test
    public void test1() {
        int t = distinctSubsequencesII.distinctSubseqII("abc");
        Assert.assertEquals(7, t);
    }

    @Test
    public void test2() {
        int t = distinctSubsequencesII.distinctSubseqII("aba");
        Assert.assertEquals(6, t);
    }

    @Test
    public void test3() {
        int t = distinctSubsequencesII.distinctSubseqII("aaa");
        Assert.assertEquals(3, t);
    }

}
