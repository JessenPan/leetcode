package org.jessenpan.leetcode;

/**
 * @author jessenpan
 */
public class S7ReverseInteger {

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }

        long result = 0;
        boolean isMinus = x < 0;
        if (isMinus) {
            x = -x;
        }
        while (x != 0) {
            int remainder = x % 10;
            result = result * 10 + remainder;
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
            x = x / 10;
        }

        return (int) (isMinus ? -result : result);
    }
}
