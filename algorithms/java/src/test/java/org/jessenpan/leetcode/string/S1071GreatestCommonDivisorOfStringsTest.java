package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1071GreatestCommonDivisorOfStringsTest {

    private S1071GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new S1071GreatestCommonDivisorOfStrings();

    @Test
    public void test1() {
        String str = greatestCommonDivisorOfStrings.gcdOfStrings("ABCABC", "ABC");
        Assert.assertEquals("ABC", str);
    }

    @Test
    public void test2() {
        String str = greatestCommonDivisorOfStrings.gcdOfStrings("ABCABC", "ABC");
        Assert.assertEquals("ABC", str);
    }

    @Test
    public void test6() {
        String str = greatestCommonDivisorOfStrings.gcdOfStrings("ABABAB", "ABAB");
        Assert.assertEquals("AB", str);
    }

    @Test
    public void test3() {
        String str = greatestCommonDivisorOfStrings.gcdOfStrings("LEET", "CODE");
        Assert.assertEquals("", str);
    }

    @Test
    public void test4() {
        String str = greatestCommonDivisorOfStrings.gcdOfStrings("ABCDEF", "ABC");
        Assert.assertEquals("", str);
    }

}
