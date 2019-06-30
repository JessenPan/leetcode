package org.jessenpan.leetcode.heap;

/**
 * @author jessenpan
 * tag:heap
 */
public class S313SuperUglyNumber {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] num = new int[n];
        num[0] = 1;
        int primesLen = primes.length;
        int[] idx = new int[primesLen];

        for (int i = 1; i < n; i++) {
            int min = min(num, idx, primes);
            for (int j = 0; j < primesLen; j++) {
                if (min == num[idx[j]] * primes[j])
                    idx[j] = idx[j] + 1;
            }
            num[i] = min;
        }
        return num[n - 1];
    }

    private int min(int[] num, int[] idx, int[] primes) {
        int res = num[idx[0]] * primes[0];
        for (int i = 1; i < primes.length; i++) {
            if (num[idx[i]] * primes[i] < res) {
                res = num[idx[i]] * primes[i];
            }
        }
        return res;
    }

}
