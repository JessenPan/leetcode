package org.jessenpan.leetcode.backtracking;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S980UniquePathsIII {

    private static final int START_SYMBOL = 1;

    private static final int END_SYMBOL = 2;

    private static final int EMPTY_SYMBOL = 0;


    private static final int PLACEHOLDER = 3;

    private int row;

    private int col;

    private Point end;

    private int emptyCnt = 0;

    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private int uniqueCount = 0;

    public int uniquePathsIII(int[][] grid) {
        Point start = null;
        row = grid.length;
        col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == START_SYMBOL) {
                    start = new Point(i, j);
                }
                if (grid[i][j] == END_SYMBOL) {
                    end = new Point(i, j);
                }
                if (grid[i][j] == EMPTY_SYMBOL) {
                    emptyCnt++;
                }
            }
        }

        countUniquePaths( grid, emptyCnt, start);
        return uniqueCount;
    }

    private void countUniquePaths( int[][] grid, int leavedEmptyCnt, Point position) {
        if (leavedEmptyCnt == 0) {
            for (int i = 0; i < 4; i++) {
                Point newPos = createNewPoint(i, position);
                if (newPos.x == end.x && newPos.y == end.y) {
                    uniqueCount++;
                }
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            Point newPoint = createNewPoint(i, position);
            if (newPoint.x >= 0 && newPoint.x < row && newPoint.y >= 0 && newPoint.y < col) {
                if (grid[newPoint.x][newPoint.y] == EMPTY_SYMBOL) {
                    grid[newPoint.x][newPoint.y] = PLACEHOLDER;
                    countUniquePaths( grid, leavedEmptyCnt - 1, newPoint);
                    grid[newPoint.x][newPoint.y] = EMPTY_SYMBOL;
                }
            }
        }
    }

    private Point createNewPoint(int i, Point origin) {
        switch (i) {
            case 0:
                return new Point(origin.x - 1, origin.y);
            case 1:
                return new Point(origin.x, origin.y + 1);
            case 2:
                return new Point(origin.x + 1, origin.y);
            case 3:
                return new Point(origin.x, origin.y - 1);
        }
        return null;
    }
}
