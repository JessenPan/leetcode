package org.jessenpan.leetcode.doublepointer;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S424LongestRepeatingCharacterReplacementTest {

    private S424LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new S424LongestRepeatingCharacterReplacement();

    @Test
    public void test1() {
        int t = longestRepeatingCharacterReplacement.characterReplacement("ABAB", 2);
        Assert.assertEquals(4, t);
    }

    @Test
    public void test2() {
        int t = longestRepeatingCharacterReplacement.characterReplacement("AABABBA", 1);
        Assert.assertEquals(4, t);
    }

}
