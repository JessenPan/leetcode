package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S821ShortestDistanceToACharacterTest {

    private S821ShortestDistanceToACharacter shortestDistanceToACharacter = new S821ShortestDistanceToACharacter();

    @Test
    public void test1() {
        int[] chars = shortestDistanceToACharacter.shortestToChar("loveleetcode", 'e');
        System.out.println(Arrays.toString(chars));
        Assert.assertArrayEquals(new int[] { 3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0 }, chars);
    }

}
