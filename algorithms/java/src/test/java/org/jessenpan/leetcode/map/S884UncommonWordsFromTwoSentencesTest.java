package org.jessenpan.leetcode.map;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S884UncommonWordsFromTwoSentencesTest {

    private S884UncommonWordsFromTwoSentences uncommonWordsFromTwoSentences = new S884UncommonWordsFromTwoSentences();

    @Test
    public void test1() {
        String[] strs = uncommonWordsFromTwoSentences.uncommonFromSentences("this apple is sweet", "this apple is sour");
        assertArrayEquals(new String[] { "sweet", "sour" }, strs);
    }

    @Test
    public void test2() {
        String[] strs = uncommonWordsFromTwoSentences.uncommonFromSentences("apple apple", "ba");
        assertArrayEquals(new String[] { "ba" }, strs);
    }

    @Test
    public void test3() {
        String[] strs = uncommonWordsFromTwoSentences.uncommonFromSentences("s z z z s", "s z ejt");
        assertArrayEquals(new String[] { "ejt" }, strs);
    }

}
