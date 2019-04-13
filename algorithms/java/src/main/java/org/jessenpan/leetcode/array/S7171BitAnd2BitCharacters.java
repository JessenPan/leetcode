package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S7171BitAnd2BitCharacters {

    public boolean isOneBitCharacter(int[] bits) {
        int length = bits.length - 1;
        int i = 0;
        while (i < length) {
            if (bits[i] == 0) {
                i++;
            } else if (bits[i] == 1 && i + 1 == length) {
                return false;
            } else if (bits[i] == 1) {
                i += 2;
            }
        }
        return true;
    }
}
