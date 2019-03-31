package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.S387FirstUniqueCharacterInAString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S387FirstUniqueCharacterInAStringTest {

    private S387FirstUniqueCharacterInAString firstUniqueCharacterInAString = new S387FirstUniqueCharacterInAString();

    @Test
    public void test1() {
        int firstUniqueChar = firstUniqueCharacterInAString.firstUniqChar("leetcode");
        assertEquals(firstUniqueChar, 0);
    }

    @Test
    public void test2() {
        int firstUniqueChar = firstUniqueCharacterInAString.firstUniqChar("loveleetcode");
        assertEquals(firstUniqueChar, 2);
    }

}
