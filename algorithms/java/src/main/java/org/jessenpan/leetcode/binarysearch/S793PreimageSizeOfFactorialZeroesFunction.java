package org.jessenpan.leetcode.binarysearch;

/**
 * @author jessenpan
 * tag:binarysearch
 */
public class S793PreimageSizeOfFactorialZeroesFunction {

    //TODO
    public int preimageSizeFZF(long K) {
        long lo = K, hi = 10 * K + 1;
        while (lo < hi) {
            long mi = lo + (hi - lo) / 2;
            long zmi = zeta(mi);
            if (zmi == K) {
                return 5;
            } else if (zmi < K) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }
        return 0;
    }

    public long zeta(long x) {
        if (x == 0) {
            return 0;
        }
        return x / 5 + zeta(x / 5);
    }

}
