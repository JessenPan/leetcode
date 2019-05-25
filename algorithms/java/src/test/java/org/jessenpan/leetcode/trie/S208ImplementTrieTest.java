package org.jessenpan.leetcode.trie;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S208ImplementTrieTest {

    private S208ImplementTrie.Trie trie = new S208ImplementTrie.Trie();
    
    @Test
    public void test1(){
        trie.insert("abb");
        Assert.assertTrue(trie.search("abb"));
        Assert.assertFalse(trie.search("abc"));
        Assert.assertTrue(trie.startsWith("a"));
        Assert.assertFalse(trie.startsWith("abd"));
    }

}
