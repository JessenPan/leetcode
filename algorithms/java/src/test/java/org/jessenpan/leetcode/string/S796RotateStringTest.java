package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S796RotateStringTest {

    private S796RotateString rotateString = new S796RotateString();

    @Test
    public void test1() {
        boolean canRotate = rotateString.rotateString("abcde", "cdeab");
        Assert.assertTrue(canRotate);
    }

    @Test
    public void test2() {
        boolean canRotate = rotateString.rotateString("abcde", "abced");
        Assert.assertFalse(canRotate);
    }

}
