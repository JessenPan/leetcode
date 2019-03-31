package org.jessenpan.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int lengthOfNums = nums.length;
        Map<Integer, Integer> numWithIndexMap = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < lengthOfNums; i++) {
            numWithIndexMap.put(nums[i], i);
        }
        int[] resultArray = new int[2];
        for (int i = 0; i < lengthOfNums; i++) {
            int oneOperatorNum = nums[i];
            int needNum = target - oneOperatorNum;
            Integer otherOperatorIndex = numWithIndexMap.get(needNum);
            if (otherOperatorIndex != null && otherOperatorIndex != i) {
                resultArray[0] = i;
                resultArray[1] = otherOperatorIndex;
                break;
            }
        }
        return resultArray;
    }
}
