package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S475Heaters {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int len = heaters.length;
        int houseLen = houses.length;
        int radius = -1;
        int calSum = 0;
        for (int i = 0; i < len; i++) {
            if (i != 0 && heaters[i - 1] > houses[houseLen - 1]) {
                continue;
            }
            if (i != (len - 1) && heaters[i + 1] < houses[0]) {
                continue;
            }
            if (calSum == 0) {
                radius = heaters[i] - houses[0];
            } else if (calSum >= 0) {
                radius = (int) Math.max(radius, Math.ceil(heaters[i] - heaters[i - 1] - 1) / 2.0);
            }
            calSum++;
            if (i == (len - 1)) {
                radius = Math.max(radius, houses[houseLen - 1] - heaters[i]);
            }
        }
        return radius;
    }

}
