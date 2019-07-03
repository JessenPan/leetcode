package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S75SortColors {

    public void sortColors(int[] nums) {

        int len = nums.length;
        if (len == 0 || len == 1) {
            return;
        }
        int zeroIdx = 0, twoIdx = len - 1;
        int i = 0;
        while (twoIdx >= 0 && nums[twoIdx] == 2) {
            twoIdx--;
        }
        while (i <= twoIdx) {
            if (nums[i] == 0) {
                swap(nums, zeroIdx, i);
                zeroIdx++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, twoIdx, i);
                twoIdx--;
                while (nums[twoIdx] == 2) {
                    twoIdx--;
                }
                if (nums[i] != 0) {
                    i++;
                }
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int zeroIdx, int i) {
        if (zeroIdx == i) {
            return;
        }
        int tmp = nums[zeroIdx];
        nums[zeroIdx] = nums[i];
        nums[i] = tmp;
    }

}
