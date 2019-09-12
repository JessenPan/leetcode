package org.jessenpan.leetcode.dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S368LargestDivisibleSubsetTest {

    private S368LargestDivisibleSubset largestDivisibleSubset = new S368LargestDivisibleSubset();

    @Test
    public void test1() {
        List<Integer> list = largestDivisibleSubset.largestDivisibleSubset(new int[] { 1, 2, 3 });
        Assert.assertEquals(Arrays.asList(1, 2), list);
    }

    @Test
    public void test2() {
        List<Integer> list = largestDivisibleSubset.largestDivisibleSubset(new int[] { 1, 2, 4, 8 });
        Assert.assertEquals(Arrays.asList(1, 2, 4, 8), list);
    }

}
