package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S859BuddyStringsTest {

    private S859BuddyStrings buddyStrings = new S859BuddyStrings();

    @Test
    public void test1() {
        boolean isBuddyString = buddyStrings.buddyStrings("ab", "ba");
        Assert.assertTrue(isBuddyString);
    }

    @Test
    public void test2() {
        boolean isBuddyString = buddyStrings.buddyStrings("ab", "ab");
        Assert.assertFalse(isBuddyString);
    }

    @Test
    public void test3() {
        boolean isBuddyString = buddyStrings.buddyStrings("aa", "aa");
        Assert.assertTrue(isBuddyString);
    }


    @Test
    public void test4() {
        boolean isBuddyString = buddyStrings.buddyStrings("aaaaaaabc", "aaaaaaacb");
        Assert.assertTrue(isBuddyString);
    }

    @Test
    public void test5() {
        boolean isBuddyString = buddyStrings.buddyStrings("", "aa");
        Assert.assertFalse(isBuddyString);
    }

}
