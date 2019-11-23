package org.jessenpan.leetcode.sample;

import java.util.*;

/**
 * @author jessenpan
 * tag:sample
 */
public class S398RandomPickIndex {

    public static class Solution {

        private Map<Integer, List<Integer>> record = new HashMap<>();

        private Map<Integer, Random> randomMap = new HashMap<>();

        public Solution(int[] nums) {
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                record.putIfAbsent(nums[i], new ArrayList<>());
                record.get(nums[i]).add(i);
            }
        }

        public int pick(int target) {
            List<Integer> idxs = record.get(target);
            if (idxs.size() == 1) {
                return idxs.get(0);
            }
            Random random = randomMap.get(target);
            if (random == null) {
                random = new Random();
                randomMap.put(target, random);
            }
            int next = random.nextInt(idxs.size());
            return idxs.get(next);
        }
    }
}
