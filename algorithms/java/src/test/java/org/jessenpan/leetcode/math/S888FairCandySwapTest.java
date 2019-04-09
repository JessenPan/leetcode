package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S888FairCandySwapTest {

    private S888FairCandySwap fairCandySwap = new S888FairCandySwap();

    @Test
    public void test1() {
        int[] swapCandies = fairCandySwap.fairCandySwap(new int[] { 1, 1 }, new int[] { 2, 2 });
        assertArrayEquals(new int[] { 1, 2 }, swapCandies);
    }

    @Test
    public void test2() {
        int[] swapCandies = fairCandySwap.fairCandySwap(new int[] { 1, 2 }, new int[] { 2, 3 });
        assertArrayEquals(new int[] { 1, 2 }, swapCandies);
    }

    @Test
    public void test3() {
        int[] swapCandies = fairCandySwap.fairCandySwap(new int[] { 2 }, new int[] { 1, 3 });
        assertArrayEquals(new int[] { 2, 3 }, swapCandies);
    }

    @Test
    public void test4() {
        int[] swapCandies = fairCandySwap.fairCandySwap(new int[] { 1, 2, 5 }, new int[] { 2, 4 });
        assertArrayEquals(new int[] { 5, 4 }, swapCandies);
    }

}
