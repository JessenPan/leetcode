package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S389FindTheDifferenceTest {

    private S389FindTheDifference findTheDifference = new S389FindTheDifference();

    @Test
    public void test1() {
        char theDifference = findTheDifference.findTheDifference("abcd", "abcde");
        assertEquals('e',theDifference);
    }

    @Test
    public void test2() {
        char theDifference = findTheDifference.findTheDifference("a", "aa");
        assertEquals('a',theDifference);
    }
}
