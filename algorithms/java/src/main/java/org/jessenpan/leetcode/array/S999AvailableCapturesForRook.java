package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S999AvailableCapturesForRook {

    /**
     * 白色的象
     */
    private final char BISHOP = 'b';

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

    public int numRookCaptures(char[][] board) {
        int numOfRook = 0;
        int row = board.length, col = board.length;
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
        
        return numOfRook;
    }
}
