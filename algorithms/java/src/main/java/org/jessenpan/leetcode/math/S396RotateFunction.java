package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S396RotateFunction {

    public int maxRotateFunction(int[] A) {
        int N = A.length;
        int S = 0;
        int t = 0;
        for (int i = 0; i < N; ++i) {
            S += A[i];
            t += i * A[i];
        }
        int res = t;
        for (int i = N - 1; i >= 0; --i) {
            // F(k+1) = F(k) + S - n * Bk[n-1]
            t += S - N * (long) A[i];
            res = Math.max(res, t);
        }
        return res;

    }

}
