package org.jessenpan.leetcode.backtracking;

import java.util.*;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S996NumberOfSquareualArrays {

    private int count;

    public int numSquarefulPerms(int[] a) {
        doPermutation(a, 0);
        return count;
    }

    private void doPermutation(int[] nums, int index) {

        if (index >= 2 && index <= nums.length) {
            if (!isPerfectSquare(nums[index - 2] + nums[index - 1])) {
                return;
            }
        }

        if (index == nums.length) {
            count++;
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = index; i < nums.length; i++) {
            if (index != i && map.get(nums[i]) != null) {
                continue;
            }
            map.put(nums[i], nums[index]);
            swap(nums, index, i);
            doPermutation(nums, index + 1);
            swap(nums, i, index);
        }
    }

    private void swap(int[] nums, int index, int index1) {
        int tmp = nums[index];
        nums[index] = nums[index1];
        nums[index1] = tmp;
    }

    public boolean isPerfectSquare(int num) {
        double d = Math.sqrt(num);
        return d - (int) d == 0;
    }
}
