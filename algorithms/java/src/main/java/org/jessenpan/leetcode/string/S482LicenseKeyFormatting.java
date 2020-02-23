package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S482LicenseKeyFormatting {

    public String licenseKeyFormatting(String S, int K) {

        int len = S.length(), size = 0;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == '-') {
                continue;
            }
            size++;
        }

        int firstGroupLen;
        if (size % K == 0) {
            firstGroupLen = K;
        } else {
            firstGroupLen = size % K;
        }

        StringBuilder sb = new StringBuilder();

        boolean isInFirstGroup = true;
        int current = 0;
        for (int i = 0; i < len; i++) {

            if (S.charAt(i) == '-') {
                continue;
            }
            sb.append(convert(S.charAt(i)));
            current++;
            if (isInFirstGroup) {
                if (current == firstGroupLen) {
                    isInFirstGroup = false;
                    current = 0;
                    sb.append("-");
                }
            } else {
                if (current == K) {
                    current = 0;
                    sb.append("-");
                }
            }
        }

        String rs = sb.toString();
        return rs.endsWith("-") ? rs.substring(0, rs.length() - 1) : rs;
    }

    char convert(char c) {
        if (Character.isDigit(c)) {
            return c;
        } else {
            return Character.toUpperCase(c);
        }
    }

}
