package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S833FindAndReplaceInStringTest {

    private S833FindAndReplaceInString findAndReplaceInString = new S833FindAndReplaceInString();

    @Test
    public void test1() {
        String str = findAndReplaceInString.findReplaceString("abcd", new int[] { 0, 2 }, new String[] { "a", "cd" }, new String[] { "eee", "ffff" });
        Assert.assertEquals("eeebffff", str);
    }

}
