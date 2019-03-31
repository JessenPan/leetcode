package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.string.S14LongestCommonPrefix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S14LongestCommonPrefixTest {

    private S14LongestCommonPrefix longestCommonPrefix = new S14LongestCommonPrefix();

    @Test
    public void test1() {
        String prefix = longestCommonPrefix.longestCommonPrefix(new String[] { "flower", "flow", "flight" });
        assertEquals("fl", prefix);
    }

    @Test
    public void test2() {
        String prefix = longestCommonPrefix.longestCommonPrefix(new String[] { "dog", "racecar", "car" });
        assertEquals("", prefix);
    }

    @Test
    public void test3() {
        String prefix = longestCommonPrefix.longestCommonPrefix(new String[] { "aca", "cba" });
        assertEquals("", prefix);
    }

}
