package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S34FindFirstAndLastPositionOfElementInSortedArrayTest {

    private S34FindFirstAndLastPositionOfElementInSortedArray findFirstAndLastPositionOfElementInSortedArray = new S34FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    public void test1() {
        int[] arr = findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8);
        Assert.assertArrayEquals(new int[] { 3, 4 }, arr);
    }

    @Test
    public void test2() {
        int[] arr = findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6);
        Assert.assertArrayEquals(new int[] { -1, -1 }, arr);
    }

    @Test
    public void test3() {
        int[] arr = findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[] { 1, 2 }, 1);
        Assert.assertArrayEquals(new int[] { 0, 0 }, arr);
    }

    @Test
    public void test4() {
        int[] arr = findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[] { 1, 2 }, 2);
        Assert.assertArrayEquals(new int[] { 1, 1 }, arr);
    }

}
