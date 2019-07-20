package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S81SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        boolean isIncreased;
        while (left <= right) {

            isIncreased = false;
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            }

            if (nums[mid] == nums[right]) {
                isIncreased = isIncreasedRange(nums, mid, right);
            }

            if (nums[mid] < nums[right] || isIncreased) {
                //mid~right有序
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                //left~mid有序
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return false;
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
