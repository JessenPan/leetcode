package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1170CompareStringsByFrequencyOfTheSmallestCharacterTest {

    private S1170CompareStringsByFrequencyOfTheSmallestCharacter compareStringsByFrequencyOfTheSmallestCharacter = new S1170CompareStringsByFrequencyOfTheSmallestCharacter();

    @Test
    public void test1() {
        int[] arr = compareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(new String[] { "cbd" }, new String[] { "zaaaz" });
        Assert.assertArrayEquals(new int[] { 1 }, arr);
    }

    @Test
    public void test2() {
        int[] arr = compareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(new String[] { "bbb", "cc" }, new String[] { "a", "aa", "aaa", "aaaa" });
        Assert.assertArrayEquals(new int[] { 1, 2 }, arr);
    }

}
