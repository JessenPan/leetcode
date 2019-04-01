package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S628MaximumProductOfThreeNumbersTest {

    private S628MaximumProductOfThreeNumbers maximumProductOfThreeNumbers = new S628MaximumProductOfThreeNumbers();

    @Test
    public void test() {
        int max = maximumProductOfThreeNumbers.maximumProduct(new int[] { 1, 2, 3 });
        assertEquals(6, max);
    }

    @Test
    public void test1() {
        int max = maximumProductOfThreeNumbers.maximumProduct(new int[] { 1, 2, 3, 4 });
        assertEquals(24, max);
    }

    @Test
    public void test2() {
        int max = maximumProductOfThreeNumbers.maximumProduct(new int[] { -2, 1, 2, 3, 4 });
        assertEquals(24, max);
    }

    @Test
    public void test3() {
        int max = maximumProductOfThreeNumbers.maximumProduct(new int[] { -2, 0, 1, 3, 4 });
        assertEquals(12, max);
    }
}
