package org.jessenpan.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:dp
 */
public class S1155NumberOfDiceRollsWithTargetSum {

    private Map<String, Long> record = new HashMap<>();

    private int mod = (int) (Math.pow(10, 9) + 7);

    public int numRollsToTarget(int d, int f, int target) {
        return (int) (calc(d, f, target) % mod);
    }

    private long calc(int d, int f, int target) {
        String key = target + "_" + d;
        if (record.get(key) != null) {
            return record.get(key);
        }
        if (target == 0 && d == 0) {
            return 1;
        }
        if (target <= 0 || d <= 0) {
            return 0;
        }
        long times = 0;

        for (int i = 1; i <= f; i++) {
            if (target - i < 0) {
                continue;
            }
            times += calc(d - 1, f, target - i);
        }
        times = times % mod;
        record.put(key, times);
        return times;
    }

}
