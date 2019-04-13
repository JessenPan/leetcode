package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S7171BitAnd2BitCharactersTest {

    private S7171BitAnd2BitCharacters bitAnd2BitCharacters = new S7171BitAnd2BitCharacters();

    @Test
    public void test1() {
        boolean isBit = bitAnd2BitCharacters.isOneBitCharacter(new int[] { 1, 0, 0 });
        assertTrue(isBit);
    }

    @Test
    public void test2() {
        boolean isBit = bitAnd2BitCharacters.isOneBitCharacter(new int[] { 1, 1, 1, 0 });
        assertFalse(isBit);
    }

}
