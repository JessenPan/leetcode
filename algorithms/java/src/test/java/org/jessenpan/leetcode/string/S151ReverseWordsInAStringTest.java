package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S151ReverseWordsInAStringTest {

    private S151ReverseWordsInAString reverseWordsInAString = new S151ReverseWordsInAString();
    
    @Test
    public void test1(){
        String reversed = reverseWordsInAString.reverseWords("the sky is blue");
        Assert.assertEquals("blue is sky the", reversed);
    }

    @Test
    public void test2(){
        String reversed = reverseWordsInAString.reverseWords("  hello world!  ");
        Assert.assertEquals("world! hello", reversed);
    }

    @Test
    public void test3(){
        String reversed = reverseWordsInAString.reverseWords("a good   example");
        Assert.assertEquals("example good a", reversed);
    }
    
}
