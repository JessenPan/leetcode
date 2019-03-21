package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:math
 */
public class S868BinaryGap {

    public int binaryGap(int n) {
        String binaryStr = Integer.toBinaryString(n);
        int distance = 0;
        int lastIndex = -1;
        int length = binaryStr.length();
        for (int i = 0; i < length; i++) {
            if (binaryStr.charAt(i) == '1' && lastIndex != -1) {
                if(i-lastIndex>distance){
                    distance=i-lastIndex;
                }
                lastIndex=i;
            } else if (binaryStr.charAt(i) != '0') {
                lastIndex = i;
            }
        }
        return distance;
    }
}
