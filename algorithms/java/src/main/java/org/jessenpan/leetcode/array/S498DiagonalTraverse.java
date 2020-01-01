package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S498DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {

        if (matrix.length == 0) { return new int[0];}
        int row = matrix.length, col = matrix[0].length;
        int[] elements = new int[row * col];
        int m = matrix.length;
        if (col == 0)
            return elements;
        int putIdx = 0;

        boolean bXFlag = true;
        for (int i = 0; i < m + col; i++) {
            int pm = bXFlag ? m : col;
            int pn = bXFlag ? col : m;

            int x = (i < pm) ? i : pm - 1;
            int y = i - x;

            while (x >= 0 && y < pn) {
                elements[putIdx] = bXFlag ? matrix[x][y] : matrix[y][x];
                putIdx++;
                x--;
                y++;
            }

            bXFlag = !bXFlag;
        }
        return elements;
    }

}
