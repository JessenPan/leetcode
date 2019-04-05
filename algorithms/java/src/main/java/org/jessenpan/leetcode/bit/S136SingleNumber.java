package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S136SingleNumber {

    /**
     * 异或的运用
     * 
     * 交换律:a^b^c=c^b^a
     *  a^0=a
     *  a^a=0
     * 
     * @param nums origin array
     * @return the single number
     */
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int num : nums) {
            a = a ^ num;
        }
        return a;
    }

}
