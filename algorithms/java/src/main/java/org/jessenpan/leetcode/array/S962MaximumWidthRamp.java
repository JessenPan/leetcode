package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S962MaximumWidthRamp {

    //TODO 
    public int maxWidthRamp(int[] a) {
        int N = a.length;
        Integer[] B = new Integer[N];
        for (int i = 0; i < N; ++i)
            B[i] = i;

        Arrays.sort(B, (i, j) -> ((Integer) a[i]).compareTo(a[j]));

        int ans = 0;
        int m = N;
        for (int i : B) {
            ans = Math.max(ans, i - m);
            m = Math.min(m, i);
        }

        return ans;
    }
    
}
