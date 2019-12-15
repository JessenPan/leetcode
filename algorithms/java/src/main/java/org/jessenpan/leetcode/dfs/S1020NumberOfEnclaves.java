package org.jessenpan.leetcode.dfs;

/**
 * @author jessenpan
 * tag:dfs
 */
public class S1020NumberOfEnclaves {

    private int row, col;
    private int[][] a;

    //TODO 
    public int numEnclaves(int[][] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        this.a = A;
        this.row = A.length;
        this.col = A[0].length;

        for (int i = 0; i < row; i++) {
            dfs(i, 0);
            dfs(i, col - 1);
        }
        for (int i = 0; i < col; i++) {
            dfs(0, i);
            dfs(row - 1, i);
        }
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (A[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int r, int c) {
        if (a[r][c] == 0)
            return;

        a[r][c] = 0;
        if (r > 0) { dfs(r - 1, c); }
        if (c > 0) { dfs(r, c - 1); }
        if (r < row - 1) { dfs(r + 1, c); }
        if (c < col - 1) { dfs(r, c + 1); }
    }

}
