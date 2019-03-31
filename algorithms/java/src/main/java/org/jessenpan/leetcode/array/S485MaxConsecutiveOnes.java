package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S485MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int lastMaxConsecutiveOne = 0, currentMaxConsecutiveOne = 0;
        int lengthOfNums = nums.length;
        for (int i = 0; i < lengthOfNums; i++) {
            if (nums[i] == 1) {
                currentMaxConsecutiveOne++;
            }
            if (nums[i] == 0 || i == (lengthOfNums - 1)) {
                if (currentMaxConsecutiveOne > lastMaxConsecutiveOne) {
                    lastMaxConsecutiveOne = currentMaxConsecutiveOne;
                }
                currentMaxConsecutiveOne = 0;
            }
        }
        return lastMaxConsecutiveOne;
    }
}
