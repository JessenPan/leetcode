package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S8StringToIntegerAtoi {

    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }

        boolean isNegative = false;
        if (str.charAt(0) == '+' || str.charAt(0) == '-') {
            isNegative = str.charAt(0) == '-';
            str = str.substring(1);
        }
        if (str.isEmpty()) {
            return 0;
        }

        if (!(str.charAt(0) >= '0' && str.charAt(0) <= '9')) {
            return 0;
        }
        int len = str.length(), i = 0;
        for (; i < len; i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                break;
            }
        }

        if (i != len) {
            str = str.substring(0, i);
        }
        int lastIdxOfZero = -1;
        len = str.length();
        for (int j = 0; j < len; j++) {
            if (str.charAt(j) == '0') {
                lastIdxOfZero = j;
            } else {
                break;
            }
        }
        if (lastIdxOfZero >= 0) {
            str = str.substring(lastIdxOfZero + 1);
        }
        if (str.isEmpty()) {
            return 0;
        }
        if (str.length() > 10) {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        if (isNegative) {
            str = "-" + str;
        }

        long val = Long.parseLong(str);
        return (val > Integer.MAX_VALUE || val < Integer.MIN_VALUE) ? (isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE) : (int) val;
    }

}
