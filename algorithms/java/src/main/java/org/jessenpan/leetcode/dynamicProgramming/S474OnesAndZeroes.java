package org.jessenpan.leetcode.dynamicProgramming;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S474OnesAndZeroes {

    public int findMaxForm(String[] strs, int m, int n) {

        if (m == 0 && n == 0) {
            return 0;
        }

        if (strs.length == 0) {
            return 0;
        }

        int strNum = strs.length;
        int[][][] rs = new int[m + 1][n + 1][strNum];

        int[][] zeroOneArray = new int[strNum][2];
        for (int i = 0; i < strNum; i++) {
            zeroOneArray[i][0] = sumOfChar(strs[i], '0');
            zeroOneArray[i][1] = sumOfChar(strs[i], '1');
        }

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k < strNum; k++) {
                    if (k == 0) {
                        if (zeroOneArray[k][0] <= i && zeroOneArray[k][1] <= j) {
                            rs[i][j][k] = 1;
                        } else {
                            rs[i][j][k] = 0;
                        }
                    } else if (i >= zeroOneArray[k][0] && j >= zeroOneArray[k][1]) {
                        rs[i][j][k] = Math.max(rs[i - zeroOneArray[k][0]][j - zeroOneArray[k][1]][k - 1] + 1, rs[i][j][k - 1]);
                    } else {
                        rs[i][j][k] = rs[i][j][k - 1];
                    }
                }
            }
        }

        return rs[m][n][strNum - 1];
    }

    private int sumOfChar(String str, char c) {
        int i = 0;
        char[] charArray = str.toCharArray();
        for (char charOfArray : charArray) {
            if (c == charOfArray) {
                i++;
            }
        }
        return i;
    }

}
