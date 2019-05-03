package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S849MaximizeDistanceToClosestPerson {

    public int maxDistToClosest(int[] seats) {

        int len = seats.length;
        int maxLen = 0, lastZeroPosition = 0, startWithZeroLen = 0;
        boolean isCounting = false;
        for (int i = 0; i < len; i++) {
            if (seats[i] == 0) {
                if (i == (len - 1) && (i - lastZeroPosition+1) > maxLen) {
                    return i - lastZeroPosition + 1;
                }
                if (i == 0) {
                    isCounting = true;
                }
                continue;
            }
            if (!isCounting) {
                if (i != (len - 1) && seats[i + 1] == 0) {
                    lastZeroPosition = i + 1;
                    isCounting = true;
                }
            } else {
                if (lastZeroPosition == 0) {
                    startWithZeroLen = i - lastZeroPosition;
                    isCounting=false;
                } else if (i - lastZeroPosition > maxLen) {
                    maxLen = i - lastZeroPosition;
                    isCounting = false;
                }
            }
        }
        if (startWithZeroLen > maxLen) {
            return startWithZeroLen;
        } else {
            if (maxLen == 0) {
                return 1;
            } else {
                return (int) Math.ceil(maxLen / 2.0);
            }
        }
    }

}
