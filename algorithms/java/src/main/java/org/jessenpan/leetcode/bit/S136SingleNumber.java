package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S136SingleNumber {

    public int singleNumber(int[] nums) {
        int a = 0;
        for (int num : nums) {
            a = a ^ num;
        }
        return a;
    }

}
