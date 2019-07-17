package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S926FlipStringToMonotoneIncreasingTest {

    private S926FlipStringToMonotoneIncreasing flipStringToMonotoneIncreasing = new S926FlipStringToMonotoneIncreasing();

    @Test
    public void test1() {
        int minFlip = flipStringToMonotoneIncreasing.minFlipsMonoIncr("00110");
        Assert.assertEquals(1, minFlip);
    }

    @Test
    public void test2() {
        int minFlip = flipStringToMonotoneIncreasing.minFlipsMonoIncr("010110");
        Assert.assertEquals(2, minFlip);
    }

    @Test
    public void test3() {
        int minFlip = flipStringToMonotoneIncreasing.minFlipsMonoIncr("00011000");
        Assert.assertEquals(2, minFlip);
    }

}
