package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S204CountPrimes {

    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = i;
        }

        for (int j = 2; j < n; j++) {
            if (0 == num[j - 1]) {
                continue;
            }
            for (int k = 2; k * j < n; k++) {
                num[k * j] = 0;
            }
        }

        num[0] = num[1] = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (0 != num[i]) {
                sum++;
            }
        }
        return sum;
    }

}
