package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S69SqrtX {

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long left = 1, right = x;
        long middle;
        while (true) {
            middle = (left + right) / 2;
            long product = middle * middle;
            if (product == x) {
                return (int) middle;
            } else if (product > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            if (left > right) {
                return (int) right;
            }
            if (right == left) {
                if (right * right > x) {
                    return (int) (right - 1);
                } else {
                    return (int) right;
                }
            }
        }
    }

}
