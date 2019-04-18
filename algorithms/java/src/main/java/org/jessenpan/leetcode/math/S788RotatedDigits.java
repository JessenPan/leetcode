package org.jessenpan.leetcode.math;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:math
 */
public class S788RotatedDigits {

    public int rotatedDigits(int n) {

        int start = 1, count = 0;
        while (start <= n) {
            if (isGoodNum(start)) {
                count++;
            }
            start++;
        }
        return count;
    }

    private static final Map<Integer, Integer> NUM_MAP = new HashMap<>();

    static {
        NUM_MAP.put(0, 0);
        NUM_MAP.put(1, 1);
        NUM_MAP.put(8, 8);
        NUM_MAP.put(2, 5);
        NUM_MAP.put(5, 2);
        NUM_MAP.put(6, 9);
        NUM_MAP.put(9, 6);
    }

    private boolean isGoodNum(int num) {
        int newNum = 0, originNum = num, times = 0;
        while (originNum != 0) {
            Integer convertedNum = NUM_MAP.get(originNum % 10);
            if (convertedNum == null) {
                return false;
            }
            newNum += (int) (Math.pow(10, times) * convertedNum);
            originNum = originNum / 10;
            times++;
        }
        return newNum != num;
    }
}
