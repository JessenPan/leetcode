package org.jessenpan.leetcode.math;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:math
 */
public class S869ReorderedPowerOf2 {

    public boolean reorderedPowerOf2(int N) {
        int[] A = count(N);
        for (int i = 0; i < 31; ++i) {
            if (Arrays.equals(A, count(1 << i))) {
                return true;
            }
        }
        return false;
    }

    public int[] count(int N) {
        int[] ans = new int[10];
        while (N > 0) {
            ans[N % 10]++;
            N /= 10;
        }
        return ans;
    }

}
