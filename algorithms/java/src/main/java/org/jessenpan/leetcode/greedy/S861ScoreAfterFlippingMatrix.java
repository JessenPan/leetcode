package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S861ScoreAfterFlippingMatrix {

    public int matrixScore(int[][] arr) {

        int row = arr.length, col = arr[0].length;
        for (int i = 0; i < row; i++) {

            StringBuilder origin = new StringBuilder();
            StringBuilder newer = new StringBuilder();
            int[] newerArr = new int[col];
            for (int j = 0; j < col; j++) {
                int newVal = arr[i][j] == 1 ? 0 : 1;
                newerArr[j] = newVal;
                origin.append(arr[i][j]);
                newer.append(newVal);
            }
            if (Integer.valueOf(newer.toString(), 2) > Integer.valueOf(origin.toString(), 2)) {
                arr[i] = newerArr;
            }
        }

        for (int i = 0; i < col; i++) {

            int nOfZero = 0, nOfOne = 0;
            for (int j = 0; j < row; j++) {
                if (arr[j][i] == 0) {
                    nOfZero++;
                } else {
                    nOfOne++;
                }
            }

            if (nOfZero <= nOfOne) {
                continue;
            }

            for (int j = 0; j < row; j++) {
                if (arr[j][i] == 0) {
                    arr[j][i] = 1;
                } else {
                    arr[j][i] = 0;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < row; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < col; j++) {
                sb.append(arr[i][j]);
            }
            sum += Integer.valueOf(sb.toString(), 2);
        }
        return sum;
    }

}
