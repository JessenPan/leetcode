package org.jessenpan.leetcode.map;

import org.jessenpan.leetcode.map.S731MyCalendarII.MyCalendarTwo;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S731MyCalendarIITest {

    @Test
    public void test1() {
        MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
        boolean valid;
        valid = myCalendarTwo.book(10, 20);
        Assert.assertTrue(valid);
        valid = myCalendarTwo.book(50, 60);
        Assert.assertTrue(valid);
        valid = myCalendarTwo.book(10, 40);
        Assert.assertTrue(valid);
        valid = myCalendarTwo.book(5, 15);
        Assert.assertFalse(valid);
        valid = myCalendarTwo.book(5, 10);
        Assert.assertTrue(valid);
        valid = myCalendarTwo.book(25, 55);
        Assert.assertTrue(valid);
        valid = myCalendarTwo.book(6, 55);
        Assert.assertTrue(valid);
        
    }

}
