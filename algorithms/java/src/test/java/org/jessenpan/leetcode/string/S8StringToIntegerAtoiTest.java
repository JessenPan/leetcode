package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S8StringToIntegerAtoiTest {

    private S8StringToIntegerAtoi stringToIntegerAtoi = new S8StringToIntegerAtoi();

    @Test
    public void test1() {
        int atoi = stringToIntegerAtoi.myAtoi("42");
        Assert.assertEquals(42, atoi);
    }

    @Test
    public void test2() {
        int atoi = stringToIntegerAtoi.myAtoi("   -42");
        Assert.assertEquals(-42, atoi);
    }

    @Test
    public void test3() {
        int atoi = stringToIntegerAtoi.myAtoi("4193 with words");
        Assert.assertEquals(4193, atoi);
    }

    @Test
    public void test4() {
        int atoi = stringToIntegerAtoi.myAtoi("words and 987");
        Assert.assertEquals(0, atoi);
    }

    @Test
    public void test5() {
        int atoi = stringToIntegerAtoi.myAtoi("-91283472332");
        Assert.assertEquals(Integer.MIN_VALUE, atoi);
    }

    @Test
    public void test6() {
        int atoi = stringToIntegerAtoi.myAtoi("+");
        Assert.assertEquals(0, atoi);
    }

    @Test
    public void test7() {
        int atoi = stringToIntegerAtoi.myAtoi("  -0012a42");
        Assert.assertEquals(-12, atoi);
    }

    @Test
    public void test8() {
        int atoi = stringToIntegerAtoi.myAtoi("00000020000000000000000000");
        Assert.assertEquals(Integer.MAX_VALUE, atoi);
    }

    @Test
    public void test9() {
        int atoi = stringToIntegerAtoi.myAtoi("0000000000000");
        Assert.assertEquals(0, atoi);
    }

    @Test
    public void test10() {
        int atoi = stringToIntegerAtoi.myAtoi("-91283472332");
        Assert.assertEquals(Integer.MIN_VALUE, atoi);
    }
    
    

}
