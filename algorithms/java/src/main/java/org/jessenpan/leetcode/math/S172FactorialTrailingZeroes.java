package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 * //TODO
 */
public class S172FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        if (n < 5) {
            return 0;
        } else {
            return n / 5 + trailingZeroes(n / 5);
        }
    }

}
