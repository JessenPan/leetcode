package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S223RectangleAreaTest {

    private S223RectangleArea rectangleArea = new S223RectangleArea();

    @Test
    public void test1() {
        int t = rectangleArea.computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
        Assert.assertEquals(45, t);
    }

}
