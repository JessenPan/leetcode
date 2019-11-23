package org.jessenpan.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S279PerfectSquares {

    private Map<Integer, Integer> record = new HashMap<>();

    {
        record.put(0, 0);
        record.put(1, 1);
    }

    public int numSquares(int n) {

        if (record.get(n) != null) {
            return record.get(n);
        }

        int times = Integer.MAX_VALUE;
        int x = (int) Math.sqrt(n);
        for (int i = x; i >= 1; i--) {
            times = Math.min(times, numSquares(n - i * i) + 1);
        }
        record.put(n, times);
        return times;
    }

}
