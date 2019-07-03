package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S75SortColorsTest {

    private S75SortColors sortColors = new S75SortColors();

    @Test
    public void test1() {
        int[] colors = new int[] { 1, 0, 1, 2, 1 };
        sortColors.sortColors(colors);
        Assert.assertArrayEquals(new int[] { 0, 1, 1, 1, 2 }, colors);
    }

    @Test
    public void test2() {
        int[] colors = new int[] { 1, 2, 0 };
        sortColors.sortColors(colors);
        Assert.assertArrayEquals(new int[] { 0, 1, 2 }, colors);
    }

    @Test
    public void test3() {
        int[] colors = new int[] { 2,1,2 };
        sortColors.sortColors(colors);
        Assert.assertArrayEquals(new int[] { 1,2,2 }, colors);
    }

    @Test
    public void test4() {
        int[] colors = new int[] { 2,2 };
        sortColors.sortColors(colors);
        Assert.assertArrayEquals(new int[] { 2,2 }, colors);
    }

}
