package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S231PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        int i = 1;
        int range = 0x40000000;
        while (((i = i << 1) <= range) && i > 0) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }

}
