package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:math
 */
public class S942DIStringMatch {

    private static final char D_SYMBOL = 'D';

    private static final char I_SYMBOL = 'I';

    public int[] diStringMatch(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        int lengthOfs = s.length();
        int[] diArray = new int[lengthOfs + 1];
        int startVal = 0, endVal = lengthOfs;
        for (int i = 0; i < lengthOfs; i++) {
            if (s.charAt(i) == D_SYMBOL) {
                diArray[i] = endVal;
                endVal--;
            } else if (s.charAt(i) == I_SYMBOL) {
                diArray[i] = startVal;
                startVal++;
            } else {
                throw new IllegalStateException();
            }
        }
        diArray[lengthOfs] = startVal;
        return diArray;
    }
}
