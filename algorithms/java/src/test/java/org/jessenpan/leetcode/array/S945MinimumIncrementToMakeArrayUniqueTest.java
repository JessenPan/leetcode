package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S945MinimumIncrementToMakeArrayUniqueTest {

    private S945MinimumIncrementToMakeArrayUnique minimumIncrementToMakeArrayUnique = new S945MinimumIncrementToMakeArrayUnique();

    @Test
    public void test1() {
        int times = minimumIncrementToMakeArrayUnique.minIncrementForUnique(new int[] { 1, 2, 2 });
        Assert.assertEquals(1, times);
    }

    @Test
    public void test2() {
        int times = minimumIncrementToMakeArrayUnique.minIncrementForUnique(new int[] { 3, 2, 1, 2, 1, 7 });
        Assert.assertEquals(6, times);
    }

    @Test
    public void test3() {
        int times = minimumIncrementToMakeArrayUnique.minIncrementForUnique(new int[] { 0, 2, 2 });
        Assert.assertEquals(1, times);
    }

    @Test
    public void test4() {
        int times = minimumIncrementToMakeArrayUnique.minIncrementForUnique(new int[] { 14, 4, 5, 14, 13, 14, 10, 17, 2, 12, 2, 14, 7, 13, 14, 13, 4, 16, 4, 10 });
        Assert.assertEquals(41, times);
    }

}
