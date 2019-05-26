package org.jessenpan.leetcode.backtracking;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S79WordSearch {

    private int row, col;

    private char[][] board;

    private String word;

    public boolean exist(char[][] board, String word) {
        row = board.length;
        col = board[0].length;
        this.board = board;
        this.word = word;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] != word.charAt(0)) {
                    continue;
                }
                if (exist(new Point(i, j), 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private boolean exist(Point point, int index) {

        if (board[point.x][point.y] != word.charAt(index)) {
            return false;
        }
        if (index + 1 == word.length()) {
            return true;
        }
        boolean isExisted;
        for (int i = 0; i < 4; i++) {
            Point newPoint = createNextPoint(i, point);
            if (newPoint.x >= 0 && newPoint.x < row && newPoint.y >= 0 && newPoint.y < col) {
                board[point.x][point.y] = '1';
                isExisted = exist(newPoint, index + 1);
                board[point.x][point.y] = word.charAt(index);
                if (isExisted) {
                    return true;
                }
            }
        }
        return false;
    }

    private Point createNextPoint(int index, Point point) {
        switch (index) {
            case 0:
                return new Point(point.x - 1, point.y);
            case 1:
                return new Point(point.x, point.y + 1);
            case 2:
                return new Point(point.x + 1, point.y);
            case 3:
                return new Point(point.x, point.y - 1);
        }
        return null;
    }
}
