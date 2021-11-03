package org.jessenpan.leetcode.divideAndConquer;

/**
 * @author jessenpan
 * tag:divideAndConquer
 */
public class S327CountOfRangeSum {

    public int countRangeSum(int[] nums, int lower, int upper) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return (nums[0] >= lower && nums[0] <= upper) ? 1 : 0;
        }

        int len = nums.length;
        long[] sums = new long[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                sums[i] = nums[i];
                continue;
            }
            sums[i] = sums[i - 1] + nums[i];
        }

        int cnt = 0;
        for (int right = 0; right < len; right++) {
            for (int left = -1; left + 1 <= right; left++) {
                if (left == -1) {
                    if (sums[right] >= lower && sums[right] <= upper) {
                        cnt++;
                    }
                    continue;
                }
                long diff = sums[right] - sums[left];
                if (diff >= lower && diff <= upper) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

}
