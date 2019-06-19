package org.jessenpan.leetcode.string;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:string
 */
public class S899OrderlyQueue {

    public String orderlyQueue(String s, int k) {
        int len = s.length();
        if (k == 1) {
            String minStr = s;
            s = s + s;
            for (int i = 0; i < len; i++) {
                String roundStr = s.substring(i, i + len);
                if (minStr.compareTo(roundStr) > 0) {
                    minStr = roundStr;
                }
            }
            return minStr;
        } else if (k > 1) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append(c[i]);
            }
            return sb.toString();
        } else {
            return s;
        }

    }

}
