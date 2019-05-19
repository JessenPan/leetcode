package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S37SudokuSolver {

    private static final List<Point> MINI_GRID_RANGE = new ArrayList<>();

    static {
        MINI_GRID_RANGE.add(new Point(2, 2));
        MINI_GRID_RANGE.add(new Point(2, 5));
        MINI_GRID_RANGE.add(new Point(2, 8));
        MINI_GRID_RANGE.add(new Point(5, 2));
        MINI_GRID_RANGE.add(new Point(5, 5));
        MINI_GRID_RANGE.add(new Point(5, 8));
        MINI_GRID_RANGE.add(new Point(8, 2));
        MINI_GRID_RANGE.add(new Point(8, 5));
        MINI_GRID_RANGE.add(new Point(8, 8));
    }

    private static char EMPTY = '.';

    private char[][] board;

    private boolean solved = false;

    public void solveSudoku(char[][] board) {
        this.board = board;
        fillSudoku(0, 0);
    }

    private void fillSudoku(int row, int col) {
        if (solved) {
            return;
        }

        int x = row, y = col;
        boolean foundEmpty = false;
        for (int i = row; i < 9; i++) {
            col = i > row ? 0 : col;
            if (foundEmpty) {
                break;
            }
            for (int j = col; j < 9; j++) {
                if (board[i][j] == EMPTY) {
                    foundEmpty = true;
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        if (((x == 8 && y == 8) || (x == row && y == col)) && board[x][y] != EMPTY) {
            solved = true;
            return;
        }

        List<Character> satisfiedNums = findSatisfiedNums(x, y);
        if (satisfiedNums.isEmpty()) {
            return;
        }
        for (Character satisfiedNum : satisfiedNums) {
            if (solved) {
                return;
            }
            board[x][y] = satisfiedNum;
            fillSudoku(x, y);
            if (!solved) {
                board[x][y] = EMPTY;
            }
        }
    }

    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private Point getCorner(int row, int col) {
        for (Point range : MINI_GRID_RANGE) {
            if ((row >= range.x - 2 && row <= range.x) && (col >= range.y - 2 && col <= range.y)) {
                return range;
            }
        }
        return null;
    }

    private List<Character> findSatisfiedNums(int row, int col) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] minGrid = new int[9];
        Point point = getCorner(row, col);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == row && board[i][j] != EMPTY) {
                    if (rows[board[i][j] - 49] == 0) {
                        rows[board[i][j] - 49]++;
                    } else {
                        return Collections.emptyList();
                    }
                }

                if (j == col && board[i][j] != EMPTY) {
                    if (cols[board[i][j] - 49] == 0) {
                        cols[board[i][j] - 49]++;
                    } else {
                        return Collections.emptyList();
                    }
                }

                if (board[i][j] != EMPTY && (i <= point.x && i >= point.x - 2) && (j <= point.y && j >= point.y - 2)) {
                    if (minGrid[board[i][j] - 49] == 0) {
                        minGrid[board[i][j] - 49]++;
                    } else {
                        return Collections.emptyList();
                    }
                }
            }
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            if (rows[i] == 0 && cols[i] == 0 && minGrid[i] == 0) {
                list.add((char) (i + 49));
            }
        }
        return list;
    }

}
