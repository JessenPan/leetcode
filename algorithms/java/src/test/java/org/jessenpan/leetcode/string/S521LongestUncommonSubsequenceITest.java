package org.jessenpan.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S521LongestUncommonSubsequenceITest {

    private S521LongestUncommonSubsequenceI longestUncommonSubsequenceI = new S521LongestUncommonSubsequenceI();

    @Test
    public void test1() {
        int length = longestUncommonSubsequenceI.findLUSlength("ab", "ba");
        assertEquals(2, length);
    }

}
