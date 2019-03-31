package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.S443StringCompression;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S443StringCompressionTest {

    private S443StringCompression stringCompression = new S443StringCompression();

    @Test
    public void test1() {
        int length = stringCompression.compress(new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' });
        assertEquals(6, length);
    }

    @Test
    public void test2() {
        int length = stringCompression.compress(new char[] { 'a' });
        assertEquals(1, length);
    }

    @Test
    public void test3() {
        int length = stringCompression.compress(new char[] { 'a','b','b','b','b','b','b','b','b','b','b','b','b' });
        assertEquals(4, length);
    }

}
