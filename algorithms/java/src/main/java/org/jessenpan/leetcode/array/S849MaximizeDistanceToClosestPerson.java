package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S849MaximizeDistanceToClosestPerson {

    public int maxDistToClosest(int[] seats) {

        int len = seats.length;
        int maxCnt = 0, lastOnePosition = -1, tmpCnt = 0;
        for (int i = 0; i < len; i++) {
            if (seats[i] == 1) {
                if (lastOnePosition == -1) {
                    tmpCnt = 2 * tmpCnt;
                }
                maxCnt = Math.max(tmpCnt, maxCnt);
                if (tmpCnt > maxCnt) {
                    maxCnt = tmpCnt;
                }
                lastOnePosition = i;
                tmpCnt = 0;
            } else {
                tmpCnt++;
                if (i == (len - 1)) {
                    tmpCnt = 2 * tmpCnt;
                    maxCnt = Math.max(tmpCnt, maxCnt);
                }
            }
        }
        return (int) Math.ceil(maxCnt / 2.0);
    }

}
