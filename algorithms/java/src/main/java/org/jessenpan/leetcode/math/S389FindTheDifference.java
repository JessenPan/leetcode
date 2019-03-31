package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S389FindTheDifference {

    public char findTheDifference(String s, String t) {
        int lengthOfS = s.length(), lengthOfT = t.length();
        long countOfS = 0, countOfT = 0;
        for (int i = 0; i < lengthOfS; i++) {
            countOfS += s.charAt(i);
        }
        for (int i = 0; i < lengthOfT; i++) {
            countOfT += t.charAt(i);
        }
        return (char) (countOfT-countOfS);
    }
}
