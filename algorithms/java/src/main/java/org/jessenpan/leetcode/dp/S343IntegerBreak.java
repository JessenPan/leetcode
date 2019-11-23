package org.jessenpan.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S343IntegerBreak {

    private Map<Integer, Integer> record = new HashMap<>();

    public int integerBreak(int n) {
        if (n < 2) {
            return 0;
        }
        record.put(2, 1);
        record.put(3, 2);
        return calc(n);
    }

    private int calc(int n) {

        if (record.get(n) != null) {
            return record.get(n);
        }

        int max = 0;
        int end = n - 2;
        for (int i = 2; i <= end; i++) {
            max = Math.max(max, i * calc(n - i));
            max = Math.max(max, i * (n - i));
        }
        record.put(n, max);
        return max;
    }

}
