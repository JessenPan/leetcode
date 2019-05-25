package org.jessenpan.leetcode.backtracing;

import org.junit.Test;

import static org.jessenpan.leetcode.backtracking.S211AddAndSearchWordDataStructureDesign.WordDictionary;

/**
 * @author jessenpan
 */
public class S211AddAndSearchWordDataStructureDesignTest {

    private WordDictionary wordDictionary = new WordDictionary();

    @Test
    public void test1() {
        wordDictionary.addWord("add");
        wordDictionary.addWord("adde");
    }

}
