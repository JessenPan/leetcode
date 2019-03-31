package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 * tag:math
 */
public class S976LargestPerimeterTriangleTest {

    private S976LargestPerimeterTriangle largestPerimeterTriangle = new S976LargestPerimeterTriangle();

    @Test
    public void test() {
        int perimeter = largestPerimeterTriangle.largestPerimeter(new int[] { 2, 1, 2 });
        assertEquals(5, perimeter);
    }

    @Test
    public void test1() {
        int perimeter = largestPerimeterTriangle.largestPerimeter(new int[] { 1, 2, 1 });
        assertEquals(0, perimeter);
    }

    @Test
    public void test2() {
        int perimeter = largestPerimeterTriangle.largestPerimeter(new int[] { 3, 2, 3, 4 });
        assertEquals(10, perimeter);
    }

    @Test
    public void test3() {
        int perimeter = largestPerimeterTriangle.largestPerimeter(new int[] { 3, 6, 2, 3 });
        assertEquals(8, perimeter);
    }

}
