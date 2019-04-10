package org.jessenpan.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S219ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> record = new HashMap<>();
        int length = nums.length;
        Integer index;
        for (int i = 0; i < length; i++) {
            index = record.get(nums[i]);
            if (index == null) {
                record.put(nums[i], i);
            } else if (Math.abs(index - i) <= k) {
                return true;
            } else if (Math.abs(index - i) > k) {
                record.put(nums[i], i);
            }
        }
        return false;
    }
}
