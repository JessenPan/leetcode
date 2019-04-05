package org.jessenpan.leetcode.bit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:bit
 */
public class S762PrimeNumberOfSetBitsInBinaryRepresentation {

    private static final Set<Integer> PRIMERS_OF_INT = new HashSet<>();

    static {
        PRIMERS_OF_INT.addAll(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 29, 31));
    }

    public int countPrimeSetBits(int l, int r) {
        int sum = 0;
        while (l <= r) {
            if (isPrime(l)) {
                sum++;
            }
            l++;
        }
        return sum;
    }

    private boolean isPrime(int num) {
        int sum = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                sum++;
            }
            num = num >> 1;
        }
        return PRIMERS_OF_INT.contains(sum);
    }

}
