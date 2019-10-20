package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S41FirstMissingPositive {

    //TODO 
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // 基本情况
        int contains = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                contains++;
                break;
            }
        }

        if (contains == 0) {
            return 1;
        }

        // nums = [1]
        if (n == 1) {
            return 2;
        }

        for (int i = 0; i < n; i++) {
            if ((nums[i] <= 0) || (nums[i] > n)) {
                nums[i] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int a = Math.abs(nums[i]);
            if (a == n) {
                nums[0] = -Math.abs(nums[0]);
            } else {
                nums[a] = -Math.abs(nums[a]);
            }
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] > 0) {
                return i;
            }
        }

        if (nums[0] > 0) {
            return n;
        }

        return n + 1;
    }

}
