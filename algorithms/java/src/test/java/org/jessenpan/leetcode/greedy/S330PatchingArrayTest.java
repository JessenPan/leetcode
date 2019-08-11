package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S330PatchingArrayTest {

    private S330PatchingArray patchingArray = new S330PatchingArray();

    @Test
    public void test1() {
        int n = patchingArray.minPatches(new int[] { 1, 3 }, 6);
        Assert.assertEquals(1, n);
    }

    @Test
    public void test2() {
        int n = patchingArray.minPatches(new int[] { 1, 5, 10 }, 20);
        Assert.assertEquals(2, n);
    }

    @Test
    public void test3() {
        int n = patchingArray.minPatches(new int[] { 1, 2, 2 }, 5);
        Assert.assertEquals(0, n);
    }

}
