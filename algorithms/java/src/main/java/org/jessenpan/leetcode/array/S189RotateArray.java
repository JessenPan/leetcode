package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S189RotateArray {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (k == len) {
            return;
        }
        int n = nums.length;
        k %= n;
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

}
