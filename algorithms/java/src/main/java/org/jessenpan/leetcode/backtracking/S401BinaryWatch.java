package org.jessenpan.leetcode.backtracking;

import java.util.*;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S401BinaryWatch {

    private static final int BIT_SIZE = 10;

    public List<String> readBinaryWatch(int num) {
        Set<String> times = new HashSet<>();
        findTime(times, new int[BIT_SIZE], num);
        return new ArrayList<>(times);
    }

    private void findTime(Set<String> times, int[] timeBit, int num) {
        if (num == 0) {
            times.add(toTime(timeBit));
            return;
        }
        for (int i = 0; i < BIT_SIZE; i++) {
            int[] newTimeBit = Arrays.copyOf(timeBit, BIT_SIZE);
            if (newTimeBit[i] == 0) {
                newTimeBit[i] = 1;
                if (betweenTimeRange(newTimeBit)) {
                    findTime(times, newTimeBit, num - 1);
                }
            }
        }

    }

    private boolean betweenTimeRange(int[] newTimeBit) {
        int hour = calHour(newTimeBit);
        if (hour > 11) {
            return false;
        }
        int min = calMin(newTimeBit);
        return min <= 59;
    }

    private int calMin(int[] timeBit) {
        int min = 0, index = 0;
        for (int i = BIT_SIZE - 1; i >= 4; i--) {
            min += timeBit[i] * Math.pow(2, index);
            index++;
        }
        return min;
    }

    private int calHour(int[] timeBit) {
        int hour = 0, index = 0;
        for (int i = 3; i >= 0; i--) {
            hour += timeBit[i] * Math.pow(2, index);
            index++;
        }
        return hour;
    }

    private String toTime(int[] timeBit) {
        StringBuilder sb = new StringBuilder();
        sb.append(calHour(timeBit)).append(":");
        int min = calMin(timeBit);
        if (min < 10) {
            sb.append("0").append(min);
        } else {
            sb.append(min);
        }
        return sb.toString();
    }
}
