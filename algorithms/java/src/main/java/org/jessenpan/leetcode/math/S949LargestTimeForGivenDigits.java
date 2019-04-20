package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S949LargestTimeForGivenDigits {

    public String largestTimeFromDigits(int[] A) {
        int length = A.length;
        String result = "";
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    continue;
                }
                for (int g = 0; g < length; g++) {
                    if (g == i || g == j) {
                        continue;
                    }
                    for (int h = 0; h < length; h++) {
                        if (h == i || h == j || h == g) {
                            continue;
                        }
                        if (A[g] * 10 + A[h] < 60 && A[i] * 10 + A[j] <= 23) {
                            if ((A[g] * 10 + A[h] + (A[i] * 10 + A[j]) * 60) > min) {
                                min = A[g] * 10 + A[h] + (A[i] * 10 + A[j]) * 60;
                                result = A[i] + A[j] + ":" + A[g] + A[h];
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
