package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S848ShiftingLettersTest {

    private S848ShiftingLetters shiftingLetters = new S848ShiftingLetters();

    @Test
    public void test1() {
        String shift = shiftingLetters.shiftingLetters("abc", new int[] { 3, 5, 9 });
        Assert.assertEquals("rpl", shift);
    }

    @Test
    public void test2() {
        String shift = shiftingLetters.shiftingLetters("bad", new int[] { 10, 20, 30 });
        Assert.assertEquals("jyh", shift);
    }

    @Test
    public void test3() {
        String shift = shiftingLetters.shiftingLetters("mkgfzkkuxownxvfvxasy", new int[] { 505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950, 81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912, 116899933, 983296461, 536563513 });
        Assert.assertEquals("wqqwlcjnkphhsyvrkdod", shift);
    }

}
