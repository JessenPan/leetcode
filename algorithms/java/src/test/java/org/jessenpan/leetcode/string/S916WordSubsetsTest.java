package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S916WordSubsetsTest {

    private S916WordSubsets wordSubsets = new S916WordSubsets();

    @Test
    public void test1() {
        List<String> list = wordSubsets.wordSubsets(new String[] { "amazon", "apple", "facebook", "google", "leetcode" }, new String[] { "e", "o" });
        Assert.assertEquals(Arrays.asList("facebook", "google", "leetcode"), list);
    }

    @Test
    public void test2() {
        List<String> list = wordSubsets.wordSubsets(new String[] { "amazon", "apple", "facebook", "google", "leetcode" }, new String[] { "l", "e" });
        Assert.assertEquals(Arrays.asList("apple", "google", "leetcode"), list);
    }

    @Test
    public void test3() {
        List<String> list = wordSubsets.wordSubsets(new String[] { "amazon", "apple", "facebook", "google", "leetcode" }, new String[] { "e", "oo" });
        Assert.assertEquals(Arrays.asList("facebook","google"), list);
    }

    @Test
    public void test4() {
        List<String> list = wordSubsets.wordSubsets(new String[] { "amazon", "apple", "facebook", "google", "leetcode" }, new String[] { "lo", "eo" });
        Assert.assertEquals(Arrays.asList("google","leetcode"), list);
    }

    @Test
    public void test5() {
        List<String> list = wordSubsets.wordSubsets(new String[] { "amazon", "apple", "facebook", "google", "leetcode" }, new String[] {"ec","oc","ceo" });
        Assert.assertEquals(Arrays.asList("facebook","leetcode"), list);
    }

}
