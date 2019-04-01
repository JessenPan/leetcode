package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S1009ComplementOfBase10Integer {

    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int complement = 0, index = 0;
        while (n != 0) {
            int bit = n % 2;
            if (bit == 0) {
                complement += Math.pow(2, index);
            }
            index++;
            n = n >>> 1;
        }
        return complement;
    }
}
