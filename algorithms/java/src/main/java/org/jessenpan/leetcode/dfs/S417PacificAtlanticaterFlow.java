package org.jessenpan.leetcode.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 * tag:dfs
 */
public class S417PacificAtlanticaterFlow {

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] pacific = new int[m][n];
        int[][] atlantic = new int[m][n];

        //从海洋边界开始
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dfs(matrix, pacific, i, j, matrix[i][j]);
                }
                if (i == m - 1 || j == n - 1) {
                    dfs(matrix, atlantic, i, j, matrix[i][j]);
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] == 1 && atlantic[i][j] == 1) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }

        return res;
    }

    private void dfs(int[][] matrix, int[][] aux, int i, int j, int pre) {
        //判断边界
        if (i < 0 || j < 0 || i > matrix.length - 1 || j > matrix[0].length - 1
                //已经流到过了
                || aux[i][j] == 1
                //不能流动
                || matrix[i][j] < pre) {
            return;
        }

        aux[i][j] = 1;

        dfs(matrix, aux, i - 1, j, matrix[i][j]);
        dfs(matrix, aux, i + 1, j, matrix[i][j]);
        dfs(matrix, aux, i, j - 1, matrix[i][j]);
        dfs(matrix, aux, i, j + 1, matrix[i][j]);
    }
}
