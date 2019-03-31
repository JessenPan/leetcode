package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.S577ReverseWordsInAStringIII;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S577ReverseWordsInAStringIIITest {

    private S577ReverseWordsInAStringIII reverseWordsInAStringIII = new S577ReverseWordsInAStringIII();

    @Test
    public void test1() {
        String reversedWord = reverseWordsInAStringIII.reverseWords("Let's take LeetCode contest");
        assertEquals("s'teL ekat edoCteeL tsetnoc",reversedWord);
    }

}
