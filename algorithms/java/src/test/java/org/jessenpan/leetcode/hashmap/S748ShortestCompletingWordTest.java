package org.jessenpan.leetcode.hashmap;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S748ShortestCompletingWordTest {

    private S748ShortestCompletingWord shortestCompletingWord = new S748ShortestCompletingWord();

    @Test
    public void test1() {
        String shortest = shortestCompletingWord.shortestCompletingWord("1s3 PSt", new String[] { "step", "steps", "stripe", "stepple" });
        Assert.assertEquals("steps", shortest);
    }

    @Test
    public void test2() {
        String shortest = shortestCompletingWord.shortestCompletingWord("1s3 456", new String[] { "looks", "pest", "stew", "show" });
        Assert.assertEquals("pest", shortest);
    }

}
