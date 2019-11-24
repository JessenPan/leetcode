package org.jessenpan.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1078OccurrencesAfterBigramTest {

    private S1078OccurrencesAfterBigram occurrencesAfterBigram = new S1078OccurrencesAfterBigram();

    @Test
    public void test1() {
        String[] arr = occurrencesAfterBigram.findOcurrences("alice is a good girl she is a good student", "a", "good");
        Assert.assertArrayEquals(new String[] { "girl", "student" }, arr);
    }

    @Test
    public void test2() {
        String[] arr = occurrencesAfterBigram.findOcurrences("we will we will rock you", "we", "will");
        Assert.assertArrayEquals(new String[] { "we", "rock" }, arr);
    }

}
