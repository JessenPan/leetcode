package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S76MinimumWindowSubstringTest {

    private S76MinimumWindowSubstring minimumWindowSubstring = new S76MinimumWindowSubstring();

    @Test
    public void test1() {
        String minWin = minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC");
        Assert.assertEquals("BANC", minWin);
    }

}
