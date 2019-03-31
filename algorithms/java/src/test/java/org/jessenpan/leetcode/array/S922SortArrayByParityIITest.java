package org.jessenpan.leetcode.array;

import org.jessenpan.leetcode.S922SortArrayByParityII;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S922SortArrayByParityIITest {

    private S922SortArrayByParityII s922SortArrayByParityII = new S922SortArrayByParityII();

    @Test
    public void test1() {
        int[] result = s922SortArrayByParityII.sortArrayByParityII(new int[] { 4, 2, 5, 7 });
        assertArrayEquals(new int[] { 4, 5, 2, 7 }, result);
    }

    @Test
    public void test2() {
        int[] result = s922SortArrayByParityII.sortArrayByParityII(new int[] { 4, 1, 1, 0, 1, 0 });
    }
}
