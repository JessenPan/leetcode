package org.jessenpan.leetcode.math;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 * tag:math
 */
public class S448FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int leavedSum = Arrays.stream(nums).sum();
        int n = nums.length;
        int originSum = n * (n + 1) / 2;
        int diff=originSum-leavedSum;
        
    }
}
