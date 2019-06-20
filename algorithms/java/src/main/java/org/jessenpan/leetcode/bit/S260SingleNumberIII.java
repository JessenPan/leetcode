package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S260SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int mask = xor & (-xor);

        int[] ans = new int[2];
        for (int num : nums) {
            if ( (num & mask) == 0) {
                ans[0] ^= num;
            } else {
                ans[1] ^= num;
            }
        }
        return ans;
    }

}
