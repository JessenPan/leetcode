package org.jessenpan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S169MajorityElement {

    public int majorityElement(int[] nums) {
        int lengthOfNums = nums.length;
        float halfLengthOfNums = (float) (lengthOfNums / 2.0);
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < lengthOfNums; i++) {
            Integer currentCount = counter.get(nums[i]);
            currentCount = currentCount == null ? 1 : currentCount + 1;
            if (currentCount > halfLengthOfNums) {
                return nums[i];
            } else {
                counter.put(nums[i], currentCount);
            }
        }
        return 0;
    }
}
