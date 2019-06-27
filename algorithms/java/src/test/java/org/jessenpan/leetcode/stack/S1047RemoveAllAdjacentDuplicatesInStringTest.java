package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1047RemoveAllAdjacentDuplicatesInStringTest {

    private S1047RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString = new S1047RemoveAllAdjacentDuplicatesInString();

    @Test
    public void test1() {
        String str = removeAllAdjacentDuplicatesInString.removeDuplicates("abbaca");
        Assert.assertEquals("ca", str);
    }

}
