package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S697DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {
        int maxLength = 0, length = nums.length;
        List<Integer> elements = new ArrayList<>();
        Map<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < length; i++) {
            Integer count = record.get(nums[i]);
            count = (count == null) ? 1 : ++count;
            record.put(nums[i], count);
            if (count == maxLength) {
                elements.add(nums[i]);
            } else if (count > maxLength) {
                elements.clear();
                maxLength = count;
                elements.add(nums[i]);
            }
        }
        int shortestLen = 0;
        for (Integer element : elements) {
            int startIndex = -1, endIndex = 0, recordCnt = 0;
            for (int i = 0; i < length; i++) {
                if (startIndex == -1 && nums[i] == element) {
                    startIndex = i;
                }
                if (nums[i] == element) {
                    recordCnt++;
                }
                if (recordCnt == maxLength) {
                    endIndex = i;
                    if (shortestLen == 0) {
                        shortestLen = endIndex - startIndex + 1;
                    } else {
                        if (endIndex - startIndex + 1 < shortestLen) {
                            shortestLen = endIndex - startIndex + 1;
                        }
                    }
                    break;
                }
            }
        }
        return shortestLen;
    }

}
