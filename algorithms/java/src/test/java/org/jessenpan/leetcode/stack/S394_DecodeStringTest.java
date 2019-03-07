package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 * @date 2019-03-07 19:53
 */
public class S394_DecodeStringTest {

    private S394_DecodeString decodeString = new S394_DecodeString();

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

}
