package org.jessenpan.leetcode.trie;

import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S472ConcatenatedWordsTest {

    private S472ConcatenatedWords concatenatedWords = new S472ConcatenatedWords();
    
    @Test
    public void test1(){
        List<String> words = concatenatedWords.findAllConcatenatedWordsInADict(new String[] { "cat", "catcat" });
        System.out.println(words);
    }
    
}
