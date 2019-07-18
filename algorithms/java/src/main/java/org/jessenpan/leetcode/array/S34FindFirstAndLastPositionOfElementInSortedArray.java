package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S34FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 0 || target < nums[0] || nums[len - 1] < target) {
            return new int[] { -1, -1 };
        }

        int[] range = new int[] { -1, -1 };
        int idx = findTarget(nums, target);
        if (nums[idx] != target) {
            return range;
        }
        int i = idx;
        while (i > 0 && nums[i] == target) {
            i--;
        }

        range[0] = nums[i] == target ? i : i + 1;
        i = idx;
        while (i < len - 1 && nums[i] == target) {
            i++;
        }
        range[1] = nums[i] == target ? i : i - 1;

        return range;
    }

    private int findTarget(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {

            int middle = right + (left - right) / 2;
            if (nums[middle] == target) {
                return middle;
            }

            if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }
}
