package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:binary search
 */
public class S704BinarySearch {

    public int search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        int left = 0, right = nums.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
