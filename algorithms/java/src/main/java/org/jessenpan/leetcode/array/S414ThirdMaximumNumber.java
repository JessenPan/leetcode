package org.jessenpan.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:array
 */
public class S414ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        Set<Integer> maxSet = new HashSet<>();
        int len = nums.length;
        int currentMax = Integer.MIN_VALUE, theMax = 0;
        boolean foundMax;
        for (int i = 0; i < 3; i++) {
            foundMax = false;
            currentMax = Integer.MIN_VALUE;
            for (int j = 0; j < len; j++) {
                if (!maxSet.contains(nums[j])) {
                    foundMax = true;
                    currentMax = Math.max(currentMax, nums[j]);
                }
            }
            if (maxSet.isEmpty()) {
                theMax = currentMax;
            }
            if (foundMax) {
                maxSet.add(currentMax);
            }
        }
        return maxSet.size() == 3 ? currentMax : theMax;
    }
}
