package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S377CombinationSumIV {

    public int combinationSum4(int[] nums, int target) {

        if (target == 0) {
            return 0;
        }
        int[] dp = new int[target + 1];
        int len = nums.length, sum;
        for (int i = 1; i <= target; i++) {
            sum = 0;
            for (int j = 0; j < len; j++) {
                if (i - nums[j] == 0) {
                    sum += 1;
                } else if (i - nums[j] > 0) {
                    sum += dp[i - nums[j]];
                }
            }
            dp[i] = sum;
        }
        return dp[target];
    }

}
