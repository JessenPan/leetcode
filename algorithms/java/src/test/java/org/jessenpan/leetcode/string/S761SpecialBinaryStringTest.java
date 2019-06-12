package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S761SpecialBinaryStringTest {

    private S761SpecialBinaryString specialBinaryString = new S761SpecialBinaryString();

    @Test
    public void test1() {
        String largest = specialBinaryString.makeLargestSpecial("11011000");
        Assert.assertEquals("11100100", largest);
    }

    @Test
    public void test2() {
        String largest = specialBinaryString.makeLargestSpecial("10");
        Assert.assertEquals("10", largest);
    }

    @Test
    public void test3() {
        String largest = specialBinaryString.makeLargestSpecial("101011001011110000101101010111000111000010");
        Assert.assertEquals("111100011100010101001111000011001010101010",largest);
        System.out.println(largest);
    }

}
