package org.jessenpan.leetcode.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S167TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Integer otherIndex, length = numbers.length;
        while (i <= length) {
            otherIndex = map.get(target - numbers[i]);
            if (otherIndex != null) {
                return new int[] { otherIndex, i + 1 };
            } else {
                map.put(numbers[i], i + 1);
            }
            i++;
        }
        return null;
    }

}
