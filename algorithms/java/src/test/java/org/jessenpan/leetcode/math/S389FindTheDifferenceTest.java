package org.jessenpan.leetcode.math;

import org.jessenpan.leetcode.math.S389FindTheDifference;
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
