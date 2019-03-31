package org.jessenpan.leetcode.stack;

import org.jessenpan.leetcode.S977SquaresOfASortedArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S977SquaresOfASortedArrayTest {

    private S977SquaresOfASortedArray s977SquaresOfASortedArray = new S977SquaresOfASortedArray();

    @Test
    public void test1() {
        int[] result = s977SquaresOfASortedArray.sortedSquares(new int[] { -4, -1, 0, 3, 10 });
        assertArrayEquals(new int[] { 0, 1, 9, 16, 100 }, result);
    }

    @Test
    public void test2() {
        int[] result = s977SquaresOfASortedArray.sortedSquares(new int[] { -7, -3, 2, 3, 11 });
        assertArrayEquals(new int[] { 4, 9, 9, 49, 121 }, result);
    }

}
