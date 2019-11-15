package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S650TwoKeysKeyboardTest {

    private S650TwoKeysKeyboard twoKeysKeyboard = new S650TwoKeysKeyboard();

    @Test
    public void test1() {
        int t = twoKeysKeyboard.minSteps(3);
        Assert.assertEquals(3, t);
    }

    @Test
    public void test2() {
        int t = twoKeysKeyboard.minSteps(16);
        Assert.assertEquals(8, t);
    }

}
