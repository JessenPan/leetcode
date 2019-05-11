package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S283MoveZeros {

    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int index = 0, length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < length; i++) {
            nums[i] = 0;
        }
    }
}
