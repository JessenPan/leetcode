package org.jessenpan.leetcode.map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S36ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            int[] map = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                map[board[i][j] - '1']++;
                if (map[board[i][j] - '1'] >= 2) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            int[] map = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                map[board[j][i] - '1']++;
                if (map[board[j][i] - '1'] >= 2) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isValid(board, i * 3, j * 3)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int x, int y) {
        int[] map = new int[9];
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                map[board[i][j] - '1']++;
                if (map[board[i][j] - '1'] >= 2) {
                    return false;
                }
            }
        }
        return true;
    }
}
