package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:math
 */
public class S171ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int sum = 0, sumOfPosition;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            sumOfPosition = s.charAt(i) - 'A' + 1;
            sum = sum * 26 + sumOfPosition;
        }
        return sum;
    }
}
