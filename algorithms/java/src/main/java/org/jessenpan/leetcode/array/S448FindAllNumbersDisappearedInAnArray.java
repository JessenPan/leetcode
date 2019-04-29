package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S448FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        List<Integer> appearedNums = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                appearedNums.add(i + 1);
            }
        }
        return appearedNums;
    }
}
