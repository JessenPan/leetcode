package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 * //REVIEW the case of <<
 */
public class S190ReverseBits {

    public int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;
        int reversed = 0;
        while (count < 32) {
            if (n < 0) {
                reversed += 1 << count;
            }
            count++;
            n = n << 1;
        }
        return reversed;
    }
}
