package org.jessenpan.leetcode.minimax;

/**
 * @author jessenpan
 * tag:minimax
 */
public class S486PredictTheWinner {

    private int[] nums;

    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        this.nums = nums;

        int maxValue = calc(0, len - 1, true);
        return maxValue >= 0;
    }

    private int calc(int left, int right, boolean who) {
        if (left == right) {
            return who ? nums[left] : -nums[left];
        }
        int playValue;
        if (who) {
            playValue = Math.max(nums[left] + calc(left + 1, right, false), nums[right] + calc(left, right - 1, false));
        } else {
            playValue = Math.min(-nums[left] + calc(left + 1, right, true), -nums[right] + calc(left, right - 1, true));
        }

        return playValue;
    }
}
