package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S476NumberComplement {

    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        }
        int complement = 0;
        int path = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                complement += Math.pow(2, path);
            }
            path++;
            num = num >> 1;
        }
        return complement;
    }
}
