package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1053PreviousPermutationWithOneSwapTest {

    private S1053PreviousPermutationWithOneSwap previousPermutationWithOneSwap = new S1053PreviousPermutationWithOneSwap();

    @Test
    public void test1() {
        int[] array = previousPermutationWithOneSwap.prevPermOpt1(new int[] { 3, 2, 1 });
        Assert.assertArrayEquals(new int[] { 3, 1, 2 }, array);
    }

    @Test
    public void test2() {
        int[] array = previousPermutationWithOneSwap.prevPermOpt1(new int[] { 1, 1, 5 });
        Assert.assertArrayEquals(new int[] { 1, 1, 5 }, array);
    }

    @Test
    public void test3() {
        int[] array = previousPermutationWithOneSwap.prevPermOpt1(new int[] { 1, 9, 4, 6, 7 });
        Assert.assertArrayEquals(new int[] { 1, 7, 4, 6, 9 }, array);
    }

    @Test
    public void test4() {
        int[] array = previousPermutationWithOneSwap.prevPermOpt1(new int[] { 3, 1, 1, 3 });
        Assert.assertArrayEquals(new int[] { 1, 3, 1, 3 }, array);
    }

}
