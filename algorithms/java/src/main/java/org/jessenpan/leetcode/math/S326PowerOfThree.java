package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S326PowerOfThree {

    private final int THREE = 3;

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n % THREE == 0) {
            n = n / THREE;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}
