package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S397IntegerReplacement {

    public int integerReplacement(int n) {

        if (n == Integer.MAX_VALUE) {
            return 32;
        }

        int count = 0;
        while (n != 1) {
            if (n == 3) {
                count += 2;
                break;
            }

            if ((n & 1) == 0) {
                n >>= 1;
            } else {
                if ((n & 2) == 2) {
                    n++;
                } else {
                    n--;
                }
            }
            count++;
        }

        return count;
    }

}
