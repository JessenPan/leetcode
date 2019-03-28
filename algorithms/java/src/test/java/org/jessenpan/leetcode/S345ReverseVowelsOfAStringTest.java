package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S345ReverseVowelsOfAStringTest {

    private S345ReverseVowelsOfAString reverseVowelsOfAString = new S345ReverseVowelsOfAString();

    @Test
    public void test1() {
        String reversed = reverseVowelsOfAString.reverseVowels("hello");
        assertEquals(reversed,"holle");
    }

    @Test
    public void test2() {
        String reversed = reverseVowelsOfAString.reverseVowels("leetcode");
        assertEquals(reversed,"leotcede");
    }

}
