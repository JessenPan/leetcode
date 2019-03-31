package org.jessenpan.leetcode.stack;

import org.jessenpan.leetcode.S739DailyTemperatures;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S739DailyTemperaturesTest {

    private S739DailyTemperatures s739DailyTemperatures = new S739DailyTemperatures();

    @Test
    public void test1() {

        int[] result = s739DailyTemperatures.dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
        assertArrayEquals(new int[] { 1, 1, 4, 2, 1, 1, 0, 0 }, result);
    }

    @Test
    public void test2() {
        int[] result = s739DailyTemperatures.dailyTemperatures(new int[] { 89, 62, 70, 58, 47, 47, 46, 76, 100, 70 });
        assertArrayEquals(new int[] { 8, 1, 5, 4, 3, 2, 1, 1, 0, 0 }, result);
    }
}
