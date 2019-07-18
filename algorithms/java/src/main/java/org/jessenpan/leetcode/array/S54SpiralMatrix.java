package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 */
public class S54SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Collections.emptyList();
        }

        List<Integer> list = new ArrayList<>();
        int row = matrix.length, col = matrix[0].length;
        int len = row * col;

        int x = 0, y = 0, i = 0;
        while (i < len) {
            while (true) {

                if (y < col && matrix[x][y] != Integer.MIN_VALUE) {
                    list.add(matrix[x][y]);
                    matrix[x][y] = Integer.MIN_VALUE;
                    y++;
                    i++;
                } else {
                    y--;
                    x++;
                    break;
                }
            }

            while (true) {
                if (x < row && matrix[x][y] != Integer.MIN_VALUE) {
                    list.add(matrix[x][y]);
                    matrix[x][y] = Integer.MIN_VALUE;
                    i++;
                    x++;
                } else {
                    y--;
                    x--;
                    break;
                }
            }

            while (true) {

                if (y >= 0 && matrix[x][y] != Integer.MIN_VALUE) {
                    list.add(matrix[x][y]);
                    matrix[x][y] = Integer.MIN_VALUE;
                    i++;
                    y--;
                } else {
                    y++;
                    x--;
                    break;
                }
            }

            while (true) {
                if (x >= 0 && matrix[x][y] != Integer.MIN_VALUE) {
                    list.add(matrix[x][y]);
                    matrix[x][y] = Integer.MIN_VALUE;
                    x--;
                    i++;
                } else {
                    x++;
                    y++;
                    break;
                }
            }
        }
        return list;
    }
}
