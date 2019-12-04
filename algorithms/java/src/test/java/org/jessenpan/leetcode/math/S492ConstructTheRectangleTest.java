package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S492ConstructTheRectangleTest {

    private S492ConstructTheRectangle constructTheRectangle = new S492ConstructTheRectangle();

    @Test
    public void test1() {
        int[] lr = constructTheRectangle.constructRectangle(4);
        Assert.assertEquals(2, lr[0]);
        Assert.assertEquals(2, lr[1]);
    }

    @Test
    public void test2() {
        int[] lr = constructTheRectangle.constructRectangle(8);
        Assert.assertEquals(4, lr[0]);
        Assert.assertEquals(2, lr[1]);
    }

    @Test
    public void test3() {
        int[] lr = constructTheRectangle.constructRectangle(9);
        Assert.assertEquals(3, lr[0]);
        Assert.assertEquals(3, lr[1]);
    }

    @Test
    public void test4() {
        int[] lr = constructTheRectangle.constructRectangle(7);
        Assert.assertEquals(7, lr[0]);
        Assert.assertEquals(1, lr[1]);
    }

}
