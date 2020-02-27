package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S754ReachANumber {

    //TODO study
    public int reachNumber(int target) {
        target = Math.abs(target);
        int p = 0, step = 0;
        while (p < target || (p + target) % 2 != 0) {
            step += 1;
            p = p + step;
        }
        return step;
    }

}
