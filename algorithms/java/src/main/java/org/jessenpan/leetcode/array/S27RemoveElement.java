package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S27RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0] == val ? 0 : 1;
        }
        int endLength = nums.length, sum = 0;
        for (int i = 0; i < endLength; i++) {
            if (nums[i] == val) {
                for (int j = endLength - 1; j > i; j--) {
                    endLength--;
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    } else {
                        sum++;
                    }
                }
                sum++;
            }
        }
        return nums.length - sum;
    }

}
