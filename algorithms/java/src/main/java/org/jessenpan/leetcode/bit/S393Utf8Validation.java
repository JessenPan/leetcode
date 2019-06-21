package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S393Utf8Validation {

    public boolean validUtf8(int[] data) {
        if (data == null || data.length == 0) {
            return false;
        }

        int len = data.length;
        int i = 0;
        while (i < len) {
            if (((data[i] >> 3) & 30) == 30 && ((data[i] >> 3) & 1) == 0) {
                //4-byte
                if (len - i - 1 < 3) {
                    return false;
                }
                if (isValidLeft(data, i + 1, 3)) {
                    i += 4;
                    continue;
                } else {
                    return false;
                }
            } else if (((data[i] >> 4) & 14) == 14 && ((data[i] >> 4) & 1) == 0) {
                //3-byte
                if (len - i - 1 < 2) {
                    return false;
                }
                if (isValidLeft(data, i + 1, 2)) {
                    i += 3;
                    continue;
                } else {
                    return false;
                }
            } else if (((data[i] >> 5) & 6) == 6 && ((data[i] >> 5) & 1) == 0) {
                //2-byte
                if (len - i - 1 < 1) {
                    return false;
                }
                if (isValidLeft(data, i + 1, 1)) {
                    i += 2;
                    continue;
                } else {
                    return false;
                }
            } else if (((data[i] >> 7) & 1) == 0) {
                i++;
                continue;
            }
            return false;
        }
        return true;
    }

    private boolean isValidLeft(int[] data, int index, int size) {
        int len = index + size;
        for (int i = index; i < len; i++) {
            if (!isValidOther(data[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidOther(int data) {
        return ((data >> 6) & 2) == 2;
    }

}
