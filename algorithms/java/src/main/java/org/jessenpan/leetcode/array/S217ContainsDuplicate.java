package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S217ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        int lengthOfNums = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < lengthOfNums; i++) {
            if (i != (lengthOfNums - 1) && nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

}
