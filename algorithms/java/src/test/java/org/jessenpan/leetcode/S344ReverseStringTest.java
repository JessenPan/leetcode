package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S344ReverseStringTest {

    private S344ReverseString reverseString = new S344ReverseString();

    @Test
    public void test1() {
        char[] origin = new char[] { 'h', 'e', 'l', 'l', 'o' };
        reverseString.reverseString(origin);
        assertArrayEquals(new char[] { 'o', 'l', 'l', 'e', 'h' }, origin);
    }

    @Test
    public void test2() {
        char[] origin = new char[] {'H','a','n','n','a','h' };
        reverseString.reverseString(origin);
        assertArrayEquals(new char[] { 'h','a','n','n','a','H' }, origin);
    }

}
