package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S754ReachANumber {

    public int reachNumber(int target) {
        int times = 0, sum = 0;
        int i = 1;
        while (sum != target) {
            if (sum + i > target) {
                sum -= i;
            } else {
                sum += i;
            }
            i++;
            times++;
        }
        return times;
    }

}
