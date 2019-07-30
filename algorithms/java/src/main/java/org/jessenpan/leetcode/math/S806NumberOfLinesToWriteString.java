package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S806NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String s) {
        int line = 0, width = 0;
        int len = s.length();

        int i = 0;
        while (i < len) {
            width = 0;
            while (i < len) {
                width += widths[s.charAt(i) - 'a'];
                if (width > 100) {
                    width -= widths[s.charAt(i) - 'a'];
                    break;
                } else {
                    i++;
                }
            }
            line++;
        }

        return new int[] { line, width };
    }
}
