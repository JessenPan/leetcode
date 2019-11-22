package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S419BattleshipsInABoard {

    private char[][] board;
    private int row, col;

    public int countBattleships(char[][] board) {

        this.board = board;
        row = board.length;
        col = board[0].length;
        int row = board.length, col = board[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (board[i][j] == 'X' && notEqualUp(i, j) && notEqualBottom(i, j)) {
                    if (j == (col - 1)) {
                        board[i][j] = '.';
                        count++;
                    } else if (board[i][j + 1] == '.') {
                        board[i][j] = '.';
                        count++;
                    } else {
                        board[i][j] = '.';
                    }
                }
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (board[j][i] == 'X') {
                    if (j == (row - 1)) {
                        count++;
                    } else if (board[j][i] == board[j + 1][i]) {
                        board[j][i] = '.';
                    } else {
                        board[j][i] = '.';
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private boolean notEqualBottom(int i, int j) {
        if (i == (row - 1)) {
            return true;
        }
        return board[i][j] != board[i + 1][j];
    }

    private boolean notEqualUp(int i, int j) {
        if (i == 0) {
            return true;
        }
        return board[i][j] != board[i - 1][j];
    }

}
