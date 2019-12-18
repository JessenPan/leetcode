package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S1175PrimeArrangements {

    private int mod = (int) (Math.pow(10, 9) + 7);

    public int numPrimeArrangements(int n) {
        if (n < 3) {
            return 1;
        }

        int numOfNonPrime = calcNumOfNonPrime(n);
        int other = n - numOfNonPrime;

        long primeFactorial = calFactorial(numOfNonPrime);
        long otherFactorial = calFactorial(other);
        return (int) (primeFactorial * otherFactorial % mod);
    }

    private long calFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long r = n * calFactorial(n - 1);
            return r % mod;
        }
    }

    private int calcNumOfNonPrime(int n) {

        int count = 0;
        boolean[] nums = new boolean[n + 1];
        for (int i = 2; i * i < nums.length; i++) {
            if (!nums[i]) {
                for (int j = i * i; j < nums.length; j += i) {
                    if (nums[j])
                        continue;
                    nums[j] = true;
                    count++;
                }
            }
        }
        count++;
        return count;
    }
}
