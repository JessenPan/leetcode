package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S289GameOfLife {

    public void gameOfLife(int[][] board) {

        int row = board.length, col = board[0].length;
        int[][] newBoard = new int[row][col];

        int sum;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 0) {
                    sum = count(i, j, board);
                    if (sum == 3) {
                        newBoard[i][j] = 1;
                    }
                } else {
                    sum = count(i, j, board);
                    newBoard[i][j] = 1;
                    if (sum < 2) {
                        newBoard[i][j] = 0;
                    } else if (sum > 3) {
                        newBoard[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = newBoard[i][j];
            }
        }
    }

    private int count(int x, int y, int[][] board) {
        int row = board.length, col = board[0].length;
        int sum = 0;

        if (x - 1 >= 0 && y - 1 >= 0) {
            sum += board[x - 1][y - 1];
        }

        if (x - 1 >= 0) {
            sum += board[x - 1][y];
        }

        if (x - 1 >= 0 && y + 1 < col) {
            sum += board[x - 1][y + 1];
        }

        if (y - 1 >= 0) {
            sum += board[x][y - 1];
        }

        if (y + 1 < col) {
            sum += board[x][y + 1];
        }

        if (x + 1 < row && y - 1 >= 0) {
            sum += board[x + 1][y - 1];
        }

        if (x + 1 < row) {
            sum += board[x + 1][y];
        }

        if (x + 1 < row && y + 1 < col) {
            sum += board[x + 1][y + 1];
        }
        return sum;
    }

}
