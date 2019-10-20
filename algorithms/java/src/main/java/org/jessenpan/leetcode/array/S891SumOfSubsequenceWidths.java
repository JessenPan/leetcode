package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S891SumOfSubsequenceWidths {

    public int sumSubseqWidths(int[] a) {
        int MOD = 1_000_000_007;
        int N = a.length;
        Arrays.sort(a);

        long[] pow2 = new long[N];
        pow2[0] = 1;
        for (int i = 1; i < N; ++i)
            pow2[i] = pow2[i-1] * 2 % MOD;

        long ans = 0;
        for (int i = 0; i < N; ++i)
            ans = (ans + (pow2[i] - pow2[N-1-i]) * a[i]) % MOD;

        return (int) ans;
    }

}
