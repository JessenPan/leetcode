package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S492ConstructTheRectangle {

    public int[] constructRectangle(int area) {

        int t = (int) Math.sqrt(area);
        if (t * t == area) {
            return new int[] { t, t };
        }

        while (true) {
            if (area % t == 0) {
                return new int[] { area / t, t };
            }
            t--;
        }
    }

}
