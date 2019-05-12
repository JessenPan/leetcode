package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S40CombinationSumII;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S40CombinationSumIITest {

    private S40CombinationSumII combinationSumII = new S40CombinationSumII();

    @Test
    public void test1() {
        combinationSumII.combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8);
    }

    @Test
    public void test2() {
        combinationSumII.combinationSum2(new int[] { 2, 5, 2, 1, 2 }, 5);
    }

}
