package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:math
 */
public class S868BinaryGap {

    public int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        int lengthOfs = str.length();
        int distance = 0;
        int lastPos = -1;
        for (int i = 0; i < lengthOfs; i++) {
            if (str.charAt(i) == '1' && lastPos != -1) {
                if (i - lastPos > distance) {
                    distance = i - lastPos;
                    lastPos = i;
                } else {
                    lastPos = i;
                }
            } else if (str.charAt(i) != '0') {
                lastPos = i;
            }
        }
        return distance;
    }

}
