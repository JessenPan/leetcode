package org.jessenpan.leetcode.dfs;

import java.util.*;

/**
 * @author jessenpan
 * tag:dfs
 */
public class S491IncreasingSubsequences {

    List<List<Integer>> rs = new ArrayList<>();

    int len;

    int[] nums;

    Set<String> record = new HashSet<>();

    public List<List<Integer>> findSubsequences(int[] nums) {

        len = nums.length;
        this.nums = nums;
        for (int i = 0; i < len - 1; i++) {
            find(nums[i], i + 1, Collections.singletonList(nums[i]), nums[i] + "");
        }
        return rs;
    }

    private void find(int lastNum, int currentIdx, List<Integer> list, String key) {

        if (list.size() > 1 && !record.contains(key)) {
            rs.add(list);
            record.add(key);
        }
        if (currentIdx >= len) {
            return;
        }
        for (int i = currentIdx; i < len; i++) {
            if (i > currentIdx && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] >= lastNum) {
                List<Integer> newList = new ArrayList<>(list);
                newList.add(nums[i]);
                find(nums[i], i + 1, newList, key + "_" + nums[i]);
            }
        }

    }

}
