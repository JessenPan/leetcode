package org.jessenpan.leetcode.trie;

import org.jessenpan.leetcode.trie.S676ImplementMagicDictionary.MagicDictionary;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S676ImplementMagicDictionaryTest {

    private MagicDictionary magicDictionary = new MagicDictionary();

    @Test
    public void test1() {
        magicDictionary.buildDict(new String[] { "hello", "leetcode" });
        assertFalse(magicDictionary.search("hello"));
        assertTrue(magicDictionary.search("hhllo"));
        assertFalse(magicDictionary.search("hell"));
        assertFalse(magicDictionary.search("leetcoded"));
    }

    @Test
    public void test2() {
        magicDictionary.buildDict(new String[] { "hello", "leetcode","hallo" });
        assertTrue(magicDictionary.search("hello"));
        assertTrue(magicDictionary.search("hhllo"));
        assertFalse(magicDictionary.search("hell"));
        assertFalse(magicDictionary.search("leetcoded"));
    }

}
