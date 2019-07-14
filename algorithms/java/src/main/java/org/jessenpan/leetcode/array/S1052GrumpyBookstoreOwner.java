package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S1052GrumpyBookstoreOwner {

    public int maxSatisfied(int[] customers, int[] grumpy, int x) {
        int len = customers.length;
        if (x == len) {
            return Arrays.stream(customers).sum();
        }
        int sum = sumRange(false, 0, len - 1, customers, grumpy);
        int size = len - x + 1;
        int max = 0, left = 0, right = x - 1;
        for (int i = 0; i < size; i++) {
            int tmpMax = sumRange(true, left + i, right + i, customers, grumpy); max = Math.max(max, tmpMax + sum);
        }

        return max;
    }

    private int sumRange(boolean isGrumpy, int left, int right, int[] customers, int[] grumpy) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            if (!isGrumpy && grumpy[i] == 0) {
                sum += customers[i];
            } else if (isGrumpy && grumpy[i] == 1) {
                sum += customers[i];
            }

        }
        return sum;
    }

}
