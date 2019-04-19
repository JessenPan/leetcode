package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S836RectangleOverlapTest {

    private S836RectangleOverlap rectangleOverlap = new S836RectangleOverlap();

    @Test
    public void test1() {
        boolean isOverlap = rectangleOverlap.isRectangleOverlap(new int[] { 0, 0, 2, 2 }, new int[] { 1, 1, 3, 3 });
        assertTrue(isOverlap);
    }

    @Test
    public void test2() {
        boolean isOverlap = rectangleOverlap.isRectangleOverlap(new int[] { 0, 0, 1, 1 }, new int[] { 1, 0, 2, 1 });
        assertFalse(isOverlap);
    }

    @Test
    public void test3() {
        boolean isOverlap = rectangleOverlap.isRectangleOverlap(new int[] { 0, 0, 1, 1 }, new int[] { 0, 0, 1, 1 });
        assertTrue(isOverlap);
    }

}
