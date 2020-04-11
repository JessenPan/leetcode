package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S829ConsecutiveNumbersSum {

    //TODO
    public int consecutiveNumbersSum(int N) {
        while ((N & 1) == 0) {
            N >>= 1;
        }
        int ans = 1, d = 3;

        while (d * d <= N) {
            int e = 0;
            while (N % d == 0) {
                N /= d;
                e++;
            }
            ans *= e + 1;
            d += 2;
        }

        if (N > 1) {
            ans <<= 1;
        }
        return ans;
    }

}
