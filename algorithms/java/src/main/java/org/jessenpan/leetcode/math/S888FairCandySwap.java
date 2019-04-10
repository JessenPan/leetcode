package org.jessenpan.leetcode.math;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:math
 */
public class S888FairCandySwap {

    public int[] fairCandySwap(int[] a, int[] b) {
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();
        for (int elementAtA : a) {
            for (int elementAtB : b) {
                if ((sumA - elementAtA + elementAtB) == (sumB - elementAtB + elementAtA)) {
                    return new int[] { elementAtA, elementAtB };
                }
            }
        }
        return null;
    }

}
