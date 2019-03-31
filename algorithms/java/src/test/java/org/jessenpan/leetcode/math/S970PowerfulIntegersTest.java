package org.jessenpan.leetcode.math;

import org.jessenpan.leetcode.S970PowerfulIntegers;
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
        List<Integer> pows = powerfulIntegers.powerfulIntegers(2, 1, 10);
        assertEquals(Arrays.asList(2, 3, 4, 5, 7, 9, 10), pows);
    }

}
