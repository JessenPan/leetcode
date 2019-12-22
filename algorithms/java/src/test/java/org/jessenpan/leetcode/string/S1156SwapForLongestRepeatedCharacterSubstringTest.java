package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1156SwapForLongestRepeatedCharacterSubstringTest {

    private S1156SwapForLongestRepeatedCharacterSubstring swapForLongestRepeatedCharacterSubstring = new S1156SwapForLongestRepeatedCharacterSubstring();

    @Test
    public void test1() {
        int t = swapForLongestRepeatedCharacterSubstring.maxRepOpt1("ababa");
        Assert.assertEquals(3, t);
    }


    @Test
    public void test2() {
        int t = swapForLongestRepeatedCharacterSubstring.maxRepOpt1("aaabaaa");
        Assert.assertEquals(6, t);
    }

    @Test
    public void test3() {
        int t = swapForLongestRepeatedCharacterSubstring.maxRepOpt1("aaabbaaa");
        Assert.assertEquals(4, t);
    }

    @Test
    public void test4() {
        int t = swapForLongestRepeatedCharacterSubstring.maxRepOpt1("aaaaa");
        Assert.assertEquals(5, t);
    }


    @Test
    public void test6() {
        int t = swapForLongestRepeatedCharacterSubstring.maxRepOpt1("abcdef");
        Assert.assertEquals(1, t);
    }

}
