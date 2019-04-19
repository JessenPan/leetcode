package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S1010PairsOfSongsWithTotalDurationsDivisibleBy60 {

    public int numPairsDivisibleBy60(int[] time) {
        int length = time.length, times = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    times++;
                }
            }
        }
        return times;
    }

}
