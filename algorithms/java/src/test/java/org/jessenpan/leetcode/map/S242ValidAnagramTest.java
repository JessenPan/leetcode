package org.jessenpan.leetcode.map;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S242ValidAnagramTest {

    private S242ValidAnagram validAnagram = new S242ValidAnagram();

    @Test
    public void test1() {
        boolean isAnagram = validAnagram.isAnagram("anagram", "nagaram");
        assertTrue(isAnagram);
    }

    @Test
    public void test2() {
        boolean isAnagram = validAnagram.isAnagram("rat", "car");
        assertFalse(isAnagram);
    }

}
