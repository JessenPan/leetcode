package org.jessenpan.leetcode.math;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:math
 */
public class S1013PartitionArrayIntoThreePartsWithEqualSum {

    public boolean canThreePartsEqualSum(int[] a) {
        int sum = Arrays.stream(a).sum();
        if (sum % 3 != 0) {
            return false;
        }
        int part = 0, partSum = sum / 3;
        int tmpSum = 0;
        for (int value : a) {
            tmpSum += value;
            if (tmpSum == partSum) {
                part++;
                tmpSum = 0;
            }
        }
        return part == 3;
    }

}
