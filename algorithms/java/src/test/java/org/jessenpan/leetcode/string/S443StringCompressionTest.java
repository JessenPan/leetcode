package org.jessenpan.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S443StringCompressionTest {

    private S443StringCompression stringCompression = new S443StringCompression();

    @Test
    public void test1() {
        char[] chars = new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int length = stringCompression.compress(chars);
        assertEquals(6, length);
    }

    @Test
    public void test2() {
        char[] chars = new char[] { 'a' };
        int length = stringCompression.compress(chars);
        assertEquals(1, length);
    }

    @Test
    public void test3() {
        char[] chars = new char[] { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int length = stringCompression.compress(chars);
        assertEquals(4, length);
    }

}
