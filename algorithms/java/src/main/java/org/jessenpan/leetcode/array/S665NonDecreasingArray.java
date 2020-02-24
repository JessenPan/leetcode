package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S665NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int len = nums.length;
        boolean hasDegrade = false;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                if (nums[i] > nums[i + 1]) {
                    nums[i] = Integer.MIN_VALUE;
                    hasDegrade = true;
                    break;
                }
            } else {
                if (nums[i - 1] > nums[i]) {
                    int leftBackUp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    if (check(nums)) {
                        return true;
                    }
                    nums[i] = leftBackUp;
                    nums[i - 1] = leftBackUp;
                    return check(nums);
                }
            }
        }
        if (!hasDegrade) {
            return true;
        }
        return check(nums);
    }

    private boolean check(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            } else {
                if (nums[i - 1] > nums[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
