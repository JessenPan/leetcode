package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S724FindPivotIndexTest {

    private S724FindPivotIndex findPivotIndex = new S724FindPivotIndex();

    @Test
    public void test1() {
        int index = findPivotIndex.pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 });
        assertEquals(3, index);
    }

    @Test
    public void test2() {
        int index = findPivotIndex.pivotIndex(new int[] { 1, 2, 3 });
        assertEquals(-1, index);
    }

    @Test
    public void test3() {
        int index = findPivotIndex.pivotIndex(new int[] { -1, -1, -1, 1, 1, 1, });
        assertEquals(-1, index);
    }

}
