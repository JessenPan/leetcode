package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S154FindMinimumInRotatedSortedArrayII {

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        boolean isIncreased;
        while (left <= right) {

            isIncreased = false;
            int mid = left + (right - left) / 2;
            if (left == right) {
                return nums[left];
            }

            if (right - left == 1) {
                return Math.min(nums[right], nums[left]);
            }

            if (nums[mid] == nums[right]) {
                isIncreased = isIncreasedRange(nums, mid, right);
            }

            if (nums[mid] < nums[right] || isIncreased) {
                //mid~right有序
                right = mid;
            } else {
                //left~right有序
                nums[mid] = nums[left];
                left = mid;
            }
        }
        return -1;
    }

    private boolean isIncreasedRange(int[] nums, int mid, int right) {
        for (int i = mid; i <= right; i++) {
            if (i == right) {
                continue;
            }
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
