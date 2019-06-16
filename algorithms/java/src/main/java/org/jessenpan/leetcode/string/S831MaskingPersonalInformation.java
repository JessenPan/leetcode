package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S831MaskingPersonalInformation {

    public String maskPII(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        if (Character.isLetter(s.charAt(0))) {
            String[] str = s.split("@");
            return (str[0].charAt(0) + "*****" + str[0].charAt(str[0].length() - 1) + "@" + str[1]).toLowerCase();
        }
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                count++;
                if (result.length() < 4) {
                    result.insert(0, s.charAt(i));
                }
            }
        }
        if (count <= 10) {
            return "***-***-" + result;
        } else {
            int m = 2;
            int n = count - 10;
            while (m-- > 0) {
                result.insert(0, "***-");
            }
            result.insert(0, "-");
            while (n-- > 0) {
                result.insert(0, "*");
            }
            return "+" + result;
        }

    }

}
