package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S459RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int maxSubLen = len / 2, repeatedTimes;
        String subStr;
        for (int i = 1; i <= maxSubLen; i++) {
            if (len % i != 0) {
                continue;
            }
            repeatedTimes = len / i;
            subStr = s.substring(0, i);
            StringBuilder repeatedStr = new StringBuilder();
            for (int j = 0; j < repeatedTimes; j++) {
                repeatedStr.append(subStr);
            }
            if (repeatedStr.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
