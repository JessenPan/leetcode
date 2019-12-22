package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S494TargetSum {

    private int[] nums;

    private int len;

    //TODO 优化为自底向上的非递归方式
    public int findTargetSumWays(int[] nums, int s) {
        this.nums = nums;
        this.len = nums.length;
        return calc(0, s);
    }

    private int calc(int idx, int cnt) {
        if (idx == len) {
            return cnt == 0 ? 1 : 0;
        }
        int sum = 0;
        sum += calc(idx + 1, cnt - this.nums[idx]);
        sum += calc(idx + 1, cnt + this.nums[idx]);
        return sum;
    }
}
