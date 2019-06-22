package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S477TotalHammingDistance {

    public int totalHammingDistance(int[] nums) {

        int total = 0, len = nums.length;
        int numOfOne = 0, mask;
        for (int i = 0; i < 32; i++) {
            numOfOne = 0;
            mask = 1;
            mask = mask << i;
            for (int num : nums) {
                if (mask == (num & mask)) {
                    numOfOne++;
                }
            }
            total += (len - numOfOne) * numOfOne;
        }

        return total;
    }

}
