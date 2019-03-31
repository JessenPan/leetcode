package org.jessenpan.leetcode.math;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jessenpan
 * tag:math
 */
public class S728SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new LinkedList<>();
        while (left <= right) {
            if (isSelfDividingNumber(left)) {
                selfDividingNumbers.add(left);
            }
            left++;
        }
        return selfDividingNumbers;
    }

    private static final int NUM_TEN = 10;

    private boolean isSelfDividingNumber(int num) {
        int beComparedNum = num;
        if (num == NUM_TEN) {
            return false;
        }
        if (beComparedNum < NUM_TEN) {
            return true;
        }
        while (beComparedNum > 1) {
            int beDividedNum = beComparedNum % 10;
            if (beDividedNum != 0) {
                if (num % beDividedNum != 0) {
                    return false;
                }
            } else {
                return false;
            }
            beComparedNum /= NUM_TEN;
        }
        return true;
    }
}
