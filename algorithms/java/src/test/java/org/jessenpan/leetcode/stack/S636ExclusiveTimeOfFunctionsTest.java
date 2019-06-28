package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S636ExclusiveTimeOfFunctionsTest {

    private S636ExclusiveTimeOfFunctions exclusiveTimeOfFunctions = new S636ExclusiveTimeOfFunctions();

    @Test
    public void test1() {
        int[] times = exclusiveTimeOfFunctions.exclusiveTime(2, Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6"));
        System.out.println(Arrays.toString(times));
        Assert.assertArrayEquals(new int[] { 3, 4 }, times);
    }

    @Test
    public void test2() {
        int[] times = exclusiveTimeOfFunctions.exclusiveTime(3, Arrays.asList("0:start:0", "0:end:0", "1:start:1", "1:end:1", "2:start:2", "2:end:2", "2:start:3", "2:end:3"));
        System.out.println(Arrays.toString(times));
        Assert.assertArrayEquals(new int[] { 1, 1, 2 }, times);
    }

}
