package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S394DecodeStringTest {

    private S394DecodeString decodeString = new S394DecodeString();

    @Test
    public void test1() {
        String decodedString = decodeString.decodeString("3[a]2[bc]");
        assertEquals("aaabcbc", decodedString);
    }

    @Test
    public void test2() {
        String decodedString = decodeString.decodeString("3[a2[c]]");
        assertEquals("accaccacc", decodedString);
    }

    @Test
    public void test3() {
        String decodedString = decodeString.decodeString("2[abc]3[cd]ef");
        assertEquals("abcabccdcdcdef", decodedString);
    }

    @Test
    public void test5() {
        String decodedString = decodeString.decodeString("a");
        assertEquals("a", decodedString);
    }

    @Test
    public void test4() {
        String decodedString = decodeString.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef");
        assertEquals("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef", decodedString);
    }

}
