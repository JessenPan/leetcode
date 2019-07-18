package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S33SearchInRotatedSortedArrayTest {

    private S33SearchInRotatedSortedArray searchInRotatedSortedArray = new S33SearchInRotatedSortedArray();

    @Test
    public void test1() {
        int idx = searchInRotatedSortedArray.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0);
        Assert.assertEquals(4, idx);
    }

    @Test
    public void test2() {
        int idx = searchInRotatedSortedArray.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3);
        Assert.assertEquals(-1, idx);
    }

}
