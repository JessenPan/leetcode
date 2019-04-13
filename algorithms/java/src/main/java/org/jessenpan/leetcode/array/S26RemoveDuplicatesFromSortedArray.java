package org.jessenpan.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:array
 */
public class S26RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        Set<Integer> record = new HashSet<>();
        int length = nums.length, newLength = 0;
        int putIndex = 0;
        for (int i = 0; i < length; i++) {
            if (!record.contains(nums[i])) {
                record.add(nums[i]);
                nums[putIndex] = nums[i];
                putIndex++;
                newLength++;
            }
        }
        return newLength;
    }
}
