package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S168ExcelSheetColumnTitle {

    private static final int CHAR_SIZE = 26;

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int charVal;
        while (n > CHAR_SIZE) {
            charVal = n % CHAR_SIZE;
            n = n / CHAR_SIZE;
            if (charVal == 0) {
                charVal = CHAR_SIZE;
                n -= 1;
            }
            sb.append((char) (charVal - 1 + 'A'));
        }
        sb.append((char) (n - 1 + 'A'));
        return sb.reverse().toString();
    }
}
