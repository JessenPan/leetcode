package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1154DayOfTheYearTest {

    private S1154DayOfTheYear dayOfTheYear = new S1154DayOfTheYear();

    @Test
    public void test1() {
        int day = dayOfTheYear.dayOfYear("2019-01-09");
        Assert.assertEquals(9, day);
    }

    @Test
    public void test2() {
        int day = dayOfTheYear.dayOfYear("2019-02-10");
        Assert.assertEquals(41, day);
    }

    @Test
    public void test3() {
        int day = dayOfTheYear.dayOfYear("2003-03-01");
        Assert.assertEquals(60, day);
    }

    @Test
    public void test4() {
        int day = dayOfTheYear.dayOfYear("2004-03-01");
        Assert.assertEquals(61, day);
    }

}
