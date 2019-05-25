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

    private Set<String> record = new HashSet<>();

    private void doPermutation(int[] nums, int index) {

        if (index >= 2 && index <= nums.length) {
            if (!isPerfectSquare(nums[index - 2] + nums[index - 1])) {
                return;
            }
        }

        if (index == nums.length) {
            StringBuilder sb = new StringBuilder();
            Arrays.stream(nums).forEach(sb::append);
            String str = sb.toString();
            if (!record.contains(str)) {
                count++;
                record.add(str);
            }
            return;
        }

        for (int i = index; i < nums.length; i++) {
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
        if (num == 1) {
            return true;
        }
        long left = 0, right = num, halfNum = (left + right) / 2;
        while ((left < right) && halfNum != left && halfNum != right) {
            if (halfNum * halfNum == num) {
                return true;
            } else if (halfNum * halfNum > num) {
                right = halfNum;
                halfNum = (left + right) / 2;
            } else {
                left = halfNum;
                halfNum = (left + right) / 2;
            }
        }
        return false;
    }
}
