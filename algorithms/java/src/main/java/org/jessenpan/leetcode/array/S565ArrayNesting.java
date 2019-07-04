package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S565ArrayNesting {

    public int arrayNesting(int[] nums) {

        int len = nums.length;
        int max = 0;
        int tmpMax = 0;
        int l = len / 2;
        for (int i = 0; i < len; i++) {
            if (max > l) {
                break;
            }
            int next = nums[i];
            tmpMax = 1;
            while (next != i) {
                tmpMax++;
                next = nums[next];
            }
            max = Math.max(tmpMax, max);
        }

        return max;
    }

}
