package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:bit
 */
public class S191NumberOf1Bits {

    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            count += 1&(n>>>i);
        }
        return count;
    }

}
