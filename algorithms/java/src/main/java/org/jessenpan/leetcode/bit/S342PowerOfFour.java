package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S342PowerOfFour {

    public boolean isPowerOfFour(int num) {
        if (num < 0 || (num & (num - 1)) != 0) {
            return false;
        }
        return (num & 0x55555554) == num;
    }
}
