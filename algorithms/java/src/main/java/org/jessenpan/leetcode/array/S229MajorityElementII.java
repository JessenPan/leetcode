package org.jessenpan.leetcode.array;

import java.util.*;

/**
 * @author jessenpan
 * tag:array
 */
public class S229MajorityElementII {

    //TODO 优化
    public List<Integer> majorityElement(int[] nums) {

        int len = nums.length;
        int maxTimes = len / 3;
        Map<Integer, Integer> record = new HashMap<>();

        Set<Integer> elements = new HashSet<>();
        for (int i = 0; i < len; i++) {
            int cnt = record.computeIfAbsent(nums[i], t -> 0);
            cnt++;
            if (cnt > maxTimes) {
                elements.add(nums[i]);
                record.remove(nums[i]);
            } else {
                record.put(nums[i], cnt);
            }
        }
        return new ArrayList<>(elements);
    }

}
