package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S754ReachANumber {

    //TODO study
    public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0) {
            target -= ++k;
        }
        return target % 2 == 0 ? k : k + 1 + k % 2;
    }

}
