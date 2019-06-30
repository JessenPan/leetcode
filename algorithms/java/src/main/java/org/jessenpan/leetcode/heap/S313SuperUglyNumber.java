package org.jessenpan.leetcode.heap;

/**
 * @author jessenpan
 * tag:heap
 */
public class S313SuperUglyNumber {

    //TODO study

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] nums = new int[n];
        nums[0] = 1;
        int primesLen = primes.length;
        int[] idxs = new int[primesLen];

        for (int i = 1; i < n; i++) {
            int min = min(nums, idxs, primes);
            for (int j = 0; j < primesLen; j++) {
                if (min == nums[idxs[j]] * primes[j])
                    idxs[j] = idxs[j] + 1;
            }
            nums[i] = min;
        }
        return nums[n - 1];
    }

    private int min(int[] nums, int[] idxs, int[] primes) {
        int res = nums[idxs[0]] * primes[0];
        for (int i = 1; i < primes.length; i++) {
            if (nums[idxs[i]] * primes[i] < res) {
                res = nums[idxs[i]] * primes[i];
            }
        }
        return res;
    }

}
