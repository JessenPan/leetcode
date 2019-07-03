package org.jessenpan.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:array
 */
public class S128LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : nums) {
            int tmp = 0;

            while (set.contains(num)) {
                tmp++;
                num++;
            }
            max = Math.max(tmp, max);
        }
        return max;
    }

}
