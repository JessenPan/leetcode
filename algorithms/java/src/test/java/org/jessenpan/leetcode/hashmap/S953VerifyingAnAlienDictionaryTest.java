package org.jessenpan.leetcode.hashmap;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S953VerifyingAnAlienDictionaryTest {

    private S953VerifyingAnAlienDictionary verifyingAnAlienDictionary = new S953VerifyingAnAlienDictionary();

    @Test
    public void test1() {
        boolean isVerified = verifyingAnAlienDictionary.isAlienSorted(new String[] { "hello", "leetcode" }, "hlabcdefgijkmnopqrstuvwxyz");
        assertTrue(isVerified);
    }

    @Test
    public void test2() {
        boolean isVerified = verifyingAnAlienDictionary.isAlienSorted(new String[] { "word", "world", "row" }, "worldabcefghijkmnpqstuvxyz");
        assertFalse(isVerified);
    }

    @Test
    public void test3() {
        boolean isVerified = verifyingAnAlienDictionary.isAlienSorted(new String[] { "apple", "app" }, "abcdefghijklmnopqrstuvwxyz");
        assertFalse(isVerified);
    }

}
