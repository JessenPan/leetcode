package org.jessenpan.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S598RangeAdditionIITest {

    private S598RangeAdditionII rangeAdditionII = new S598RangeAdditionII();

    @Test
    public void test1() {
        int num = rangeAdditionII.maxCount(3, 3, new int[][] { { 2, 2 }, { 3, 3 } });
        assertEquals(4,num);
    }

    @Test
    public void test2() {
        int num = rangeAdditionII.maxCount(3, 3, new int[][] { });
        assertEquals(9,num);
    }

}
