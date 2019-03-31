package org.jessenpan.leetcode.hashmap;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S500KeyboardRowTest {

    private S500KeyboardRow keyboardRow = new S500KeyboardRow();

    @Test
    public void test1() {
        String[] words = keyboardRow.findWords(new String[] { "Hello", "Alaska", "Dad", "Peace" });
        assertArrayEquals(new String[] { "Alaska", "Dad" }, words);
    }

}
