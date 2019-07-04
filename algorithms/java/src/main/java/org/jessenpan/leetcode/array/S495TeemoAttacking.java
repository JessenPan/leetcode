package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S495TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int len = timeSeries.length;
        int[] endSeries = new int[len];
        for (int i = 0; i < len; i++) {
            endSeries[i] = timeSeries[i] + duration;
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i == (len - 1)) {
                sum += duration;
                continue;
            }
            if (endSeries[i] > timeSeries[i + 1]) {
                sum += timeSeries[i + 1] - timeSeries[i];
            } else {
                sum += duration;
            }
        }

        return sum;
    }

}
