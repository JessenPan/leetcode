package org.jessenpan.leetcode.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:dp
 */
public class S416PartitionEqualSubsetSum {

    private int[] nums;

    public boolean canPartition(int[] nums) {

        int sum = Arrays.stream(nums).sum();
        if ((sum & 1) == 1) {
            return false;
        }
        int half = sum / 2;
        this.nums = nums;
        return find(0, half);
    }

    Map<String, Boolean> record = new HashMap<>();

    private boolean find(int currentIdx, int sum) {

        String key = currentIdx + "_" + sum;

        if (record.get(key) != null) {
            return record.get(key);
        }

        if (sum == 0) {
            record.put(key, true);
            return true;
        }
        if (sum < 0 || currentIdx >= nums.length) {
            return false;
        }

        boolean rs = find(currentIdx + 1, sum - nums[currentIdx]);
        if (rs) {
            record.put(key, true);
            return rs;
        }
        rs = find(currentIdx + 1, sum);
        record.put(key, rs);
        return rs;
    }

}
