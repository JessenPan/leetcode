package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S66PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] == 0) {
            digits[0] = 1;
            return digits;
        }
        int i, length = digits.length;
        i = length - 1;
        int carry = 0;
        int sumedVal;
        while (i >= 0) {
            if (i == (length - 1)) {
                sumedVal = digits[i] + 1;
            } else {
                sumedVal = digits[i] + carry;
            }

            if (sumedVal >= 10) {
                digits[i] = sumedVal - 10;
                carry = 1;
            } else {
                digits[i] = sumedVal;
                carry = 0;
                break;
            }
            i--;
        }
        if (carry != 1) {
            return digits;
        } else {
            int[] newDigits = new int[length + 1];
            System.arraycopy(digits, 0, newDigits, 1, length);
            newDigits[0] = 1;
            return newDigits;
        }
    }
}
