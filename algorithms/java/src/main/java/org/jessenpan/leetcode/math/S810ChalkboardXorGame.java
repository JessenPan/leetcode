package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S810ChalkboardXorGame {

    public boolean xorGame(int[] nums) {

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor == 0 || nums.length % 2 == 0;
    }

}
