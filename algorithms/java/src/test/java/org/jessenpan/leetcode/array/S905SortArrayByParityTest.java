package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S905SortArrayByParityTest {

    private S905SortArrayByParity sortArrayByParity = new S905SortArrayByParity();

    @Test
    public void test1() {
        int[] result = sortArrayByParity.sortArrayByParity(new int[] { 3, 1, 2, 4 });
        assertArrayEquals(new int[] { 2, 4, 3, 1 }, result);
    }

}
