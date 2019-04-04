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

        int length = nums.length;
        int movePath = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                movePath += 1;
            } else if (nums[i] == 0) {
                while (nums[length - 1] == 0 && (length - 1) > i) {
                    length--;
                }
                for (int j = i; j < length - 1; j++) {
                    nums[j - movePath + 1] = nums[j - movePath];
                }
                nums[length - 1] = 0;
                length--;
            }
        }
    }
}
