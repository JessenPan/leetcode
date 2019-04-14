package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S643MaximumAverageSubarrayITest {

    private S643MaximumAverageSubarrayI maximumAverageSubarrayI = new S643MaximumAverageSubarrayI();

    @Test
    public void test1() {
        double average = maximumAverageSubarrayI.findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4);
        assertEquals(12.75, average, 0);
    }

    @Test
    public void test2() {
        double average = maximumAverageSubarrayI.findMaxAverage(new int[] { 5 }, 1);
        assertEquals(5.0, average, 0);
    }

    @Test
    public void test3() {
        double average = maximumAverageSubarrayI.findMaxAverage(new int[] { 0, 1, 1, 3, 3 }, 4);
        assertEquals(2.0, average, 0);
    }

}
