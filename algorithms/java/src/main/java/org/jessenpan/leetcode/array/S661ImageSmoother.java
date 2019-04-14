package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S661ImageSmoother {

    public int[][] imageSmoother(int[][] m) {
        int row = m.length, col = m[0].length;
        int[][] smooth = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                smooth[i][j] = calSmooth(m, i, j, row, col);
            }
        }
        return smooth;
    }

    private int calSmooth(int[][] m, int i, int j, int row, int col) {
        int count = 0;
        double sum = 0;
        int newI, newJ;
        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                newI = i + k;
                newJ = j + l;
                if (newI >= 0 && newJ >= 0 && newI <= (row - 1) && newJ <= (col - 1)) {
                    count++;
                    sum += m[newI][newJ];
                }
            }
        }
        return (int) Math.floor(sum / count);
    }

}
