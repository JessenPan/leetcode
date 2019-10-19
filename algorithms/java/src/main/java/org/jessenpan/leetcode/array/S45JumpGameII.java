package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S45JumpGameII {

    public int jump(int[] nums) {

        if (nums.length <= 1) {
            return 0;
        }

        int len = nums.length;

        int times = 0, jumpIdx = 0;
        while (jumpIdx < len) {

            int distance = nums[jumpIdx];
            if (jumpIdx + distance >= len - 1) {
                times++;
                break;
            }

            int maxIdx = jumpIdx + distance;
            int maxJumpIdx = jumpIdx + 1;
            for (int i = jumpIdx + 1; i <= maxIdx; i++) {
                if (nums[i] + i >= nums[maxJumpIdx] + maxJumpIdx) {
                    maxJumpIdx = i;
                }
            }
            times++;
            jumpIdx = maxJumpIdx;
        }
        return times;
    }

}
