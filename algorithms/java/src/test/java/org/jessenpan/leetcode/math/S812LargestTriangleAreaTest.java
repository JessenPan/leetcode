package org.jessenpan.leetcode.math;

import org.jessenpan.leetcode.S812LargestTriangleArea;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S812LargestTriangleAreaTest {

    private S812LargestTriangleArea largestTriangleArea = new S812LargestTriangleArea();

    @Test
    public void test1() {
        double area = largestTriangleArea.largestTriangleArea(new int[][] { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 0, 2 }, { 2, 0 } });
        assertEquals(2.0, area, 0);
    }

    @Test
    public void test2() {
        double area = largestTriangleArea.largestTriangleArea(new int[][] { { 1, 0 }, { 0, 0 }, { 0, 1 } });
        assertEquals(0.5, area, 0);
    }

}
