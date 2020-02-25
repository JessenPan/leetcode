package org.jessenpan.leetcode.math;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S970PowerfulIntegersTest {

    private S970PowerfulIntegers powerfulIntegers = new S970PowerfulIntegers();

    @Test
    public void test1() {
        List<Integer> pows = powerfulIntegers.powerfulIntegers(2, 3, 10);
        assertEquals(Arrays.asList(2, 3, 4, 5, 7, 9, 10), pows);
    }

    @Test
    public void test2() {
        List<Integer> pows = powerfulIntegers.powerfulIntegers(3, 5, 15);
        assertEquals(Arrays.asList(2, 4, 6, 8, 10, 14), pows);
    }
}
