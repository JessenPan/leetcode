package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S400NthDigit {

    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        long sum = 0;
        int j = 1;
        for (long i = 1; i < Integer.MAX_VALUE; i *= 10, j++) {
            if (sum + 9 * i * j >= n) {
                int index = (int)((long) n - sum - 1L) % j;
                long num = (n - sum - 1) / j + i;
                String str = String.valueOf(num);
                char[] c = str.toCharArray();
                return Integer.valueOf(c[index]) - 48;
            }
            sum += 9 * i * j;
        }
        return -1;
    }

}
