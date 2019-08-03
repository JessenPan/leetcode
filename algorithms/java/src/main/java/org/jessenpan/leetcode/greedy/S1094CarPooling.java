package org.jessenpan.leetcode.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S1094CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {

        Arrays.sort(trips, (o1, o2) -> o1[1] == o2[1] ? Integer.compare(o1[2], o2[2]) : Integer.compare(o1[1], o2[1]));

        int len = trips.length;

        List<int[]> currentTrips = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                currentTrips.add(trips[i]);
                capacity -= trips[i][0];
                continue;
            }

            List<int[]> tmpTrips = new ArrayList<>();
            for (int[] curTrip : currentTrips) {
                if (curTrip[2] <= trips[i][1]) {
                    capacity += curTrip[0];
                } else {
                    tmpTrips.add(curTrip);
                }
            }
            tmpTrips.add(trips[i]);
            capacity -= trips[i][0];
            if (capacity < 0) {
                return false;
            }
            currentTrips = tmpTrips;
        }
        return true;
    }

}
