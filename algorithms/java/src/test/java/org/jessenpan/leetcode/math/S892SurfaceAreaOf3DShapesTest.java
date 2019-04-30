package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S892SurfaceAreaOf3DShapesTest {

    private S892SurfaceAreaOf3DShapes surfaceAreaOf3DShapes = new S892SurfaceAreaOf3DShapes();

    @Test
    public void test1() {
        int area = surfaceAreaOf3DShapes.surfaceArea(new int[][] { { 2 } });
        assertEquals(10, area);
    }

    @Test
    public void test2() {
        int area = surfaceAreaOf3DShapes.surfaceArea(new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } });
        assertEquals(32, area);
    }

    @Test
    public void test3() {
        int area = surfaceAreaOf3DShapes.surfaceArea(new int[][] { { 2, 2, 2 }, { 2, 1, 1 }, { 2, 2, 2 } });
        assertEquals(46, area);
    }

}
