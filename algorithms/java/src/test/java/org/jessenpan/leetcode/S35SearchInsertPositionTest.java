package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S35SearchInsertPositionTest {

    private S35SearchInsertPosition searchInsertPosition = new S35SearchInsertPosition();

    @Test
    public void test1() {
        int position = searchInsertPosition.searchInsert(new int[] { 1, 3, 5, 6 }, 5);
        assertEquals(2, position);
    }

    @Test
    public void test2() {
        int position = searchInsertPosition.searchInsert(new int[] { 1, 3, 5, 6 }, 2);
        assertEquals(1, position);
    }

    @Test
    public void test3() {
        int position = searchInsertPosition.searchInsert(new int[] { 1, 3, 5, 6 }, 7);
        assertEquals(4, position);
    }

    @Test
    public void test4() {
        int position = searchInsertPosition.searchInsert(new int[] { 1, 3, 5, 6 }, 0);
        assertEquals(0, position);
    }

    @Test
    public void test5() {
        int position = searchInsertPosition.searchInsert(new int[] { 1, 2, 3, 4, 6 }, 5);
        assertEquals(4, position);
    }

}
