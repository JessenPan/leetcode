package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S999AvailableCapturesForRook {

    /**
     * 白色的象
     */
    private final char BISHOP = 'B';

    /**
     * 空位置
     */
    private final char EMPTY = '.';

    /**
     * 白色的车
     */
    private final char ROOK = 'R';
    /**
     * 黑色的卒
     */
    private final char PAWN = 'p';

    private int row;

    private int col;

    public int numRookCaptures(char[][] board) {
        int numOfRook = 0;
        this.row = board.length;
        this.col = board.length;
        int[] point = new int[2];
        boolean hasFound = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == ROOK) {
                    point[0] = i;
                    point[1] = j;
                    hasFound = true;
                    break;
                }
            }
            if (hasFound) {
                break;
            }
        }

        if (isNorthCapture(point, board)) {
            numOfRook++;
        }
        if (isSouthCapture(point, board)) {
            numOfRook++;
        }
        if (isWestCapture(point, board)) {
            numOfRook++;
        }
        if (isEastCapture(point, board)) {
            numOfRook++;
        }
        return numOfRook;
    }

    private boolean isEastCapture(int[] point, char[][] board) {
        for (int i = point[1] + 1; i < col; i++) {
            if (board[point[0]][i] == PAWN) {
                return true;
            }
            if (board[point[0]][i] == BISHOP) {
                return false;
            }
        }
        return false;
    }

    private boolean isWestCapture(int[] point, char[][] board) {
        for (int i = point[1] - 1; i >= 0; i--) {
            if (board[point[0]][i] == PAWN) {
                return true;
            }
            if (board[point[0]][i] == BISHOP) {
                return false;
            }
        }
        return false;
    }

    private boolean isSouthCapture(int[] point, char[][] board) {
        for (int i = point[0] + 1; i < row; i++) {
            if (board[i][point[1]] == PAWN) {
                return true;
            }
            if (board[i][point[1]] == BISHOP) {
                return false;
            }
        }
        return false;
    }

    private boolean isNorthCapture(int[] point, char[][] board) {
        for (int i = point[0] - 1; i >= 0; i--) {
            if (board[i][point[1]] == PAWN) {
                return true;
            }
            if (board[i][point[1]] == BISHOP) {
                return false;
            }
        }
        return false;
    }
}
