package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S819MostCommonWordTest {

    private S819MostCommonWord mostCommonWord = new S819MostCommonWord();

    @Test
    public void test1() {
        String word = mostCommonWord.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] { "hit" });
        Assert.assertEquals("ball", word);
    }


    @Test
    public void test2() {
        String word = mostCommonWord.mostCommonWord("Bob", new String[] {});
        Assert.assertEquals("bob", word);
    }

}
