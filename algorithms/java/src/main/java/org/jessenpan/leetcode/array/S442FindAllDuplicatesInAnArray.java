package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S442FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> duplicates = new ArrayList<>();
        int length = nums.length;
        int index;
        for (int i = 0; i < length; i++) {
            index = Math.abs(nums[i]) - 1;
            int val = nums[index];
            if (val < 0) {
                duplicates.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        return duplicates;
    }

}
