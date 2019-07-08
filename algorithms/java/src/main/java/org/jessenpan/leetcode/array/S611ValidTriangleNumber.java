package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S611ValidTriangleNumber {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (isTriangle(nums[i], nums[j], nums[k])) {
                        sum++;
                    } else {
                        break;
                    }
                }
            }
        }
        return sum;
    }

    private boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a - b < c);
    }

}
