package org.jessenpan.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S645SetMismatch {

    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> record = new HashMap<>();
        int[] errorNums = new int[2];
        int errorSum = 0;
        for (int val : nums) {
            Integer count = record.get(val);
            count = count == null ? 1 : ++count;
            record.put(val, count);
            if (count == 2) {
                errorNums[0] = val;
            }
            errorSum += val;
        }
        errorNums[1] = (nums.length * (nums.length + 1)) / 2 - errorSum + errorNums[0];
        return errorNums;
    }

}
