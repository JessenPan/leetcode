package org.jessenpan.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S560SubarraySumEqualsK {

    //TODO  
    public int subarraySum(int[] nums, int k) {

        int sum = 0, count = 0;
        Map<Integer, Integer> record = new HashMap<>();
        record.put(0, 1);
        for (int num : nums) {
            sum += num;
            count += record.computeIfAbsent(sum - k, t -> 0);
            int cnt = record.computeIfAbsent(sum, t -> 0);
            record.put(sum, ++cnt);
        }
        return count;

    }

}
