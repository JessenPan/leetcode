package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S985SumOfEvenNumbersAfterQueriesTest {

    private S985SumOfEvenNumbersAfterQueries sumOfEvenNumbersAfterQueries = new S985SumOfEvenNumbersAfterQueries();

    @Test
    public void test1() {
        int[] answers = sumOfEvenNumbersAfterQueries.sumEvenAfterQueries(new int[] { 1, 2, 3, 4 }, new int[][] { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } });
        assertArrayEquals(new int[] { 8, 6, 2, 4 }, answers);
    }

}
