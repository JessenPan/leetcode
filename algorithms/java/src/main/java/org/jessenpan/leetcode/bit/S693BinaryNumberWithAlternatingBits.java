package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S693BinaryNumberWithAlternatingBits {

    public boolean hasAlternatingBits(int n) {
        if (n <= 1) {
            return true;
        }

        int lastBit = -1;
        while (n != 0) {
            int reminder = n % 2;
            if (lastBit == -1) {
                lastBit = reminder;
            } else if (reminder == lastBit) {
                return false;
            } else {
                lastBit = reminder;
            }
            n = n >> 1;
        }
        return true;
    }
}
