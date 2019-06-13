package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S6ZigZagConversion {

    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        int length = s.length();
        char[][] zigZagArray = new char[numRows][length];
        boolean isVertical = true;
        int row = 0, col = 0;
        for (int i = 0; i < length; i++) {
            if (isVertical) {
                zigZagArray[row][col] = s.charAt(i);
                ++row;
                if (row == numRows) {
                    isVertical = false;
                    col++;
                    row -= 2;
                }
            } else {
                zigZagArray[row][col] = s.charAt(i);
                row--;
                col++;
                if (row < 0) {
                    row += 2;
                    isVertical = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < length; j++) {
                if (zigZagArray[i][j] != 0) {
                    sb.append(zigZagArray[i][j]);
                }
            }
        }
        return sb.toString();
    }
}
