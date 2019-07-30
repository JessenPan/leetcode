package org.jessenpan.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1122RelativeSortArrayTest {

    private S1122RelativeSortArray relativeSortArray = new S1122RelativeSortArray();

    @Test
    public void test1() {
        int[] array = relativeSortArray.relativeSortArray(new int[] { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 }, new int[] { 2, 1, 4, 3, 9, 6 });
        Assert.assertArrayEquals(new int[] { 2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19 }, array);
    }

    @Test
    public void test2() {
        int[] array = relativeSortArray.relativeSortArray(new int[] { 28, 6, 22, 8, 44, 17 }, new int[] { 22, 28, 8, 6 });
        Assert.assertArrayEquals(new int[] { 22, 28, 8, 6, 17, 44 }, array);
    }

}
