package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S88MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = 0, num2Index = 0, movedTimes = 0;
        while (num2Index < n) {
            if (nums2[num2Index] < nums1[nums1Index] || (nums1Index + 1 > m + movedTimes)) {
                rightMoveOne(nums1, nums1Index);
                nums1[nums1Index] = nums2[num2Index];
                num2Index++;
                movedTimes++;
            }
            nums1Index++;
        }
    }

    private void rightMoveOne(int[] nums, int moveIndex) {
        int endIndex = nums.length - 1;
        while (endIndex > moveIndex) {
            nums[endIndex] = nums[endIndex - 1];
            endIndex--;
        }
    }
}
