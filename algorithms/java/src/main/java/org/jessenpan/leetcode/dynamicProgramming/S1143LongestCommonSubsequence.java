package org.jessenpan.leetcode.dynamicProgramming;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S1143LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {

        if (text1.isEmpty() || text2.isEmpty()) {
            return 0;
        }

        if (text1.equals(text2)) {
            return text1.length();
        }

        int lenOfText1 = text1.length();
        int lenOfText2 = text2.length();

        int[][] rs = new int[lenOfText1 + 1][lenOfText2 + 1];

        for (int i = 1; i < lenOfText1 + 1; i++) {
            for (int j = 1; j < lenOfText2 + 1; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    rs[i][j] = rs[i - 1][j - 1] + 1;
                } else {
                    rs[i][j] = Math.max(rs[i - 1][j], rs[i][j - 1]);
                }
            }
        }

        return rs[lenOfText1][lenOfText2];
    }
}
