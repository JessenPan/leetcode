package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S81SearchInRotatedSortedArrayIITest {

    private S81SearchInRotatedSortedArrayII searchInRotatedSortedArrayII = new S81SearchInRotatedSortedArrayII();

    @Test
    public void test1() {
        boolean isFound = searchInRotatedSortedArrayII.search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 0);
        Assert.assertTrue(isFound);
    }

    @Test
    public void test2() {
        boolean isFound = searchInRotatedSortedArrayII.search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 3);
        Assert.assertFalse(isFound);
    }

    @Test
    public void test3() {
        boolean isFound = searchInRotatedSortedArrayII.search(new int[] { 3, 1, 1 }, 3);
        Assert.assertTrue(isFound);
    }

    @Test
    public void test4() {
        boolean isFound = searchInRotatedSortedArrayII.search(new int[] { 1, 1, 3, 1 }, 3);
        Assert.assertTrue(isFound);
    }

    @Test
    public void test5() {
        boolean isFound = searchInRotatedSortedArrayII.search(new int[] { 2, 2, 2, 0, 2, 2 }, 0);
        Assert.assertTrue(isFound);
    }

}
