package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.string.S58LengthOfLastWord;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S58LengthOfLastWordTest {

    private S58LengthOfLastWord lengthOfLastWord = new S58LengthOfLastWord();

    @Test
    public void test1() {
        int length = lengthOfLastWord.lengthOfLastWord("hello world");
        assertEquals(5, length);
    }

    @Test
    public void test2() {
        int length = lengthOfLastWord.lengthOfLastWord("b a ");
        assertEquals(1, length);
    }

}
