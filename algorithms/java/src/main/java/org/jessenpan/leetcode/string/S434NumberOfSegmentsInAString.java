package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S434NumberOfSegmentsInAString {

    public int countSegments(String s) {
        if (s.isEmpty() || s.trim().isEmpty()) {
            return 0;
        }
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        char last = ' ';
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                last = s.charAt(i);
                sb.append(last);
                continue;
            }

            if (s.charAt(i) == ' ' && last == ' ') {
                continue;
            }
            last = s.charAt(i);
            sb.append(last);
        }
        String[] words = sb.toString().split(" ");
        return words.length;
    }

}
