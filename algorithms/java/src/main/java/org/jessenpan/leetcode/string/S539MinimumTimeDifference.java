package org.jessenpan.leetcode.string;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 * tag:string
 */
public class S539MinimumTimeDifference {

    public int findMinDifference(List<String> timePoints) {
        int[] times = new int[timePoints.size()];
        int idx = 0;
        for (String s : timePoints) {
            times[idx++] = getMinute(s);
        }
        Arrays.sort(times);
        int res = times[0] + 24 * 60 - times[times.length - 1];
        for (int i = 1; i < times.length; i++) {
            res = Math.min(times[i] - times[i - 1], res);
        }
        return res;
    }

    private int getMinute(String s) {
        String[] strs = s.split(":");
        return Integer.parseInt(strs[0]) * 60 + Integer.parseInt(strs[1]);
    }

}
