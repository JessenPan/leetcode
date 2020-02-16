package org.jessenpan.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S324WiggleSortIITest {

    private S324WiggleSortII wiggleSortII = new S324WiggleSortII();

    @Test
    public void test1() {
        int[] arrays = new int[] { 1, 5, 1, 1, 6, 4 };
        wiggleSortII.wiggleSort(arrays);
        Assert.assertArrayEquals(new int[] { 1, 4, 1, 5, 1, 6 }, arrays);
    }

    @Test
    public void test2() {
        int[] arrays = new int[] { 1, 3, 2, 2, 3, 1 };
        wiggleSortII.wiggleSort(arrays);
        Assert.assertArrayEquals(new int[] { 2, 3, 1, 3, 1, 2 }, arrays);
    }

    @Test
    public void test3() {
        int[] arrays = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        wiggleSortII.wiggleSort(arrays);
        Assert.assertArrayEquals(new int[] { 2, 3, 1, 3, 1, 2 }, arrays);
    }

}
