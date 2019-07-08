package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S1011CapacityToShipPackagesWithinDdays {

    //TODO study
    public int shipWithinDays(int[] weights, int d) {
        int min = Arrays.stream(weights).max().getAsInt();
        int max = Arrays.stream(weights).sum();

        while (min < max) {

            int temp = 0, day = 1;
            int mid = (min + max) / 2;

            for (int weight : weights) {
                temp += weight;
                if (temp > mid) {
                    day += 1;
                    temp = weight;
                }
            }

            if (day > d) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

}
