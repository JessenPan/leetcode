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

}
