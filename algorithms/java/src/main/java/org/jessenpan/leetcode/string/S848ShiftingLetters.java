package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S848ShiftingLetters {

    public String shiftingLetters(String s, int[] shifts) {

        int len = shifts.length;
        for (int i = len - 1; i >= 0; i--) {
            if (i != (len - 1)) {
                shifts[i] = getRemainder(shifts[i]) + getRemainder(shifts[i + 1]);
            }
        }
        char[] array = s.toCharArray();
        for (int i = 0; i < len; i++) {
            int shift = getRemainder(shifts[i]);
            array[i] = (char) ((array[i] - 'a' + shift) % 26 + 'a');
        }
        return new String(array);
    }

    private int getRemainder(int shift) {
        return shift >= 26 ? shift % 26 : shift;
    }

}
