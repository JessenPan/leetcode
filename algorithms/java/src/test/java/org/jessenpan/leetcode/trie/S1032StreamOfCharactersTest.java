package org.jessenpan.leetcode.trie;

import org.jessenpan.leetcode.trie.S1032StreamOfCharacters.StreamChecker;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S1032StreamOfCharactersTest {

    @Test
    public void test1(){
        StreamChecker streamChecker = new StreamChecker(new String[] { "cd", "f", "kl" });
        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('b'));
        assertFalse(streamChecker.query('c'));
        assertTrue(streamChecker.query('d'));
        assertFalse(streamChecker.query('e'));
        assertTrue(streamChecker.query('f'));
        assertFalse(streamChecker.query('g'));
        assertFalse(streamChecker.query('h'));
        assertFalse(streamChecker.query('i'));
        assertFalse(streamChecker.query('j'));
        assertFalse(streamChecker.query('k'));
        assertTrue(streamChecker.query('l'));
    }
    
}
