package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S154FindMinimumInRotatedSortedArrayIITest {

    private S154FindMinimumInRotatedSortedArrayII findMinimumInRotatedSortedArrayII = new S154FindMinimumInRotatedSortedArrayII();

    @Test
    public void test1() {
        int min = findMinimumInRotatedSortedArrayII.findMin(new int[] { 1, 3, 5 });
        Assert.assertEquals(1, min);
    }

    @Test
    public void test2() {
        int min = findMinimumInRotatedSortedArrayII.findMin(new int[] { 2, 2, 2, 0, 1 });
        Assert.assertEquals(0, min);
    }

    @Test
    public void test3() {
        int min = findMinimumInRotatedSortedArrayII.findMin(new int[] { 10, 1, 10, 10, 10 });
        Assert.assertEquals(1, min);
    }

}
