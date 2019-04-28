package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S883ProjectionAreaOf3DShapesTest {

    private S883ProjectionAreaOf3DShapes projectionAreaOf3DShapes = new S883ProjectionAreaOf3DShapes();

    @Test
    public void test1() {
        int projectionArea = projectionAreaOf3DShapes.projectionArea(new int[][] { { 2 } });
        assertEquals(5, projectionArea);
    }

    @Test
    public void test2() {
        int projectionArea = projectionAreaOf3DShapes.projectionArea(new int[][] { { 1, 2 }, { 3, 4 } });
        assertEquals(17, projectionArea);
    }

}
