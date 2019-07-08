package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S228SummaryRange {

    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        List<String> list = new ArrayList<>();
        int lastIdx = 0;
        for (int i = 0; i < len; i++) {
            if (i == (len - 1)) {
                recordRange(nums, list, lastIdx, i);
                continue;
            }
            if (nums[i] + 1 != nums[i + 1]) {
                recordRange(nums, list, lastIdx, i);
                lastIdx = i + 1;
            }
        }
        return list;
    }

    private void recordRange(int[] nums, List<String> list, int lastIdx, int i) {
        if (lastIdx >= 0 && lastIdx != i) {
            list.add(nums[lastIdx] + "->" + nums[i]);
        } else {
            list.add(nums[i] + "");
        }
    }

}
