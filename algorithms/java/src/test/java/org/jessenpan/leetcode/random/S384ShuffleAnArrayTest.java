package org.jessenpan.leetcode.random;

import org.junit.Test;

import static org.jessenpan.leetcode.random.S384ShuffleAnArray.*;

/**
 * @author jessenpan
 */
public class S384ShuffleAnArrayTest {

    @Test
    public void test1() {
        int[] nums = new int[] { 1, 2, 3 };
        Solution solution = new Solution(nums);
        int[] shuffled = solution.shuffle();
        solution.reset();
        solution.shuffle();
    }

}
