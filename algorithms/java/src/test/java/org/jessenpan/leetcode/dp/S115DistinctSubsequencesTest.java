package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S115DistinctSubsequencesTest {

    private S115DistinctSubsequences distinctSubsequences = new S115DistinctSubsequences();

    @Test
    public void test1() {
        int t = distinctSubsequences.numDistinct("rabbbit", "rabbit");
        Assert.assertEquals(3, t);
    }

    @Test
    public void test2() {
        int t = distinctSubsequences.numDistinct("babgbag", "bag");
        Assert.assertEquals(5, t);
    }

    @Test
    public void test3() {
        int t = distinctSubsequences.numDistinct("daacaedaceacabbaabdccdaaeaebacddadcaeaacadbceaecddecdeedcebcdacdaebccdeebcbdeaccabcecbeeaadbccbaeccbbdaeadecabbbedceaddcdeabbcdaeadcddedddcececbeeabcbecaeadddeddccbdbcdcbceabcacddbbcedebbcaccac", "ceadbaa");
        Assert.assertEquals(5, t);
    }

}
