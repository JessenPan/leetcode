package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S461HammingDistance {

    public int hammingDistance(int x, int y) {
        int m = x ^ y;
        int distance = 0;
        while (m != 0) {
            distance += m % 2;
            m = m >> 1;
        }
        return distance;
    }
}
