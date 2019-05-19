package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S51NQueens {

    private static int QUEEN = 1;

    private static int EMPTY = 0;

    private static int PLACEHOLDER = 2;

    private int len;

    private List<List<String>> nqueens = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        if (n == 1) {
            List<List<String>> list = new ArrayList<>();
            list.add(new ArrayList<>(Collections.singletonList("Q")));
            return list;
        }

        this.len = n;
        findNQueen(new int[n][n], 0, 0, 0);
        return nqueens;
    }

    private List<String> convert2Queen(int[][] chessBoard) {
        List<String> queen = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < len; j++) {
                if (chessBoard[i][j] == QUEEN) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            queen.add(sb.toString());
        }
        return queen;
    }

    private void findNQueen(int[][] chessBoard, int placedQueen, int row, int col) {

        if (placedQueen == len) {
            //do something
            nqueens.add(convert2Queen(chessBoard));
            return;
        }

        for (int i = row; i < len; i++) {
            if (i > row) {
                col = 0;
            }
            for (int j = col; j < len; j++) {
                if (chessBoard[i][j] == EMPTY) {
                    int[][] newBoard = copyNewChessBoard(chessBoard);
                    boolean canPlace = placeQueen(newBoard, i, j);
                    if (!canPlace) {
                        continue;
                    }
                    findNQueen(newBoard, placedQueen + 1, i, j);
                }
            }
        }
    }

    private int[][] copyNewChessBoard(int[][] origin) {
        int[][] newBoard = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                newBoard[i][j] = origin[i][j];
            }
        }
        return newBoard;
    }

    private boolean placeQueen(int[][] chessBoard, int row, int col) {
        chessBoard[row][col] = QUEEN;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {

                if (i == row) {
                    if (chessBoard[i][j] == EMPTY) {
                        chessBoard[i][j] = PLACEHOLDER;
                    } else if (j != col && chessBoard[i][j] == QUEEN) {
                        return false;
                    }
                }

                if (j == col) {
                    if (chessBoard[i][j] == EMPTY) {
                        chessBoard[i][j] = PLACEHOLDER;
                    } else if (i != row && chessBoard[i][j] == QUEEN) {
                        return false;
                    }
                }
            }
        }

        int i = row - 1, j = col - 1;
        Point point = new Point(i, j);
        boolean canPlace = placeCaterCorner(chessBoard, point12 -> point12.x >= 0 && point12.y >= 0, point, point1 -> {
            point1.x--;
            point1.y--;
        });
        if (!canPlace) {
            return false;
        }

        i = row - 1;
        j = col + 1;
        point = new Point(i, j);
        canPlace = placeCaterCorner(chessBoard, point12 -> point12.x >= 0 && point12.y < len, point, point1 -> {
            point1.x--;
            point1.y++;
        });
        if (!canPlace) {
            return false;
        }

        i = row + 1;
        j = col - 1;
        point = new Point(i, j);
        canPlace = placeCaterCorner(chessBoard, point12 -> point12.x < len && point12.y >= 0, point, point1 -> {
            point1.x++;
            point1.y--;
        });
        if (!canPlace) {
            return false;
        }

        i = row + 1;
        j = col + 1;
        point = new Point(i, j);
        canPlace = placeCaterCorner(chessBoard, point12 -> point12.x < len && point12.y < len, point, point1 -> {
            point1.x++;
            point1.y++;
        });
        return canPlace;
    }

    static class Point {

        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private boolean placeCaterCorner(int[][] chessBoard, Predicate<Point> predicate, Point point, Consumer<Point> consumer) {

        while (predicate.test(point)) {
            if (chessBoard[point.x][point.y] == QUEEN) {
                return false;
            }
            if (chessBoard[point.x][point.y] == EMPTY) {
                chessBoard[point.x][point.y] = PLACEHOLDER;
            }
            consumer.accept(point);
        }
        return true;
    }

}
