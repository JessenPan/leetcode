package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S153FindMinimumInRotatedSortedArrayTest {

    private S153FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new S153FindMinimumInRotatedSortedArray();

    @Test
    public void test1() {
        int min = findMinimumInRotatedSortedArray.findMin(new int[] { 3, 4, 5, 1, 2 });
        Assert.assertEquals(1, min);
    }

    @Test
    public void test2() {
        int min = findMinimumInRotatedSortedArray.findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 });
        Assert.assertEquals(0, min);
    }

    @Test
    public void test3() {
        int min = findMinimumInRotatedSortedArray.findMin(new int[] { 1, 2 });
        Assert.assertEquals(1, min);
    }

}
