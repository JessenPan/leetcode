package org.jessenpan.leetcode.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:bfs
 */
public class S529MineSweeper {

    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }

        if (board[click[0]][click[1]] != 'E') {
            return board;
        }

        int mine = around(click, board);
        if (mine > 0) {
            board[click[0]][click[1]] = String.valueOf(mine).toCharArray()[0];
            return board;
        }
        int row = board.length, col = board[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(click);
        while (!queue.isEmpty()) {
            int[] idx = queue.poll();
            if (board[idx[0]][idx[1]] == 'B' || board[idx[0]][idx[1]] == 'M') {
                continue;
            }
            int numOfMine = around(idx, board);
            if (numOfMine > 0) {
                board[idx[0]][idx[1]] = String.valueOf(numOfMine).toCharArray()[0];
            } else {
                board[idx[0]][idx[1]] = 'B';
                int x = idx[0], y = idx[1];
                if (x - 1 >= 0 && board[x - 1][y] == 'E') {
                    queue.add(new int[] { x - 1, y });
                }
                if (x + 1 < row && board[x + 1][y] == 'E') {
                    queue.add(new int[] { x + 1, y });
                }
                if (y - 1 >= 0 && board[x][y - 1] == 'E') {
                    queue.add(new int[] { x, y - 1 });
                }
                if (y + 1 < col && board[x][y + 1] == 'E') {
                    queue.add(new int[] { x, y + 1 });
                }
                if (x - 1 >= 0 && y - 1 >= 0 && board[x - 1][y - 1] == 'E') {
                    queue.add(new int[] { x - 1, y - 1 });
                }
                if (x - 1 >= 0 && y + 1 < col && board[x - 1][y + 1] == 'E') {
                    queue.add(new int[] { x - 1, y + 1 });
                }
                if (x + 1 < row && y - 1 >= 0 && board[x + 1][y - 1] == 'E') {
                    queue.add(new int[] { x + 1, y - 1 });
                }
                if (x + 1 < row && y + 1 < col && board[x + 1][y + 1] == 'E') {
                    queue.add(new int[] { x + 1, y + 1 });
                }
            }
        }
        return board;
    }

    private int around(int[] idx, char[][] board) {
        int row = board.length, col = board[0].length;
        int x = idx[0], y = idx[1];
        int numOfMine = 0;
        if (x - 1 >= 0 && board[x - 1][y] == 'M') {
            numOfMine++;
        }
        if (x + 1 < row && board[x + 1][y] == 'M') {
            numOfMine++;
        }
        if (y - 1 >= 0 && board[x][y - 1] == 'M') {
            numOfMine++;
        }
        if (y + 1 < col && board[x][y + 1] == 'M') {
            numOfMine++;
        }
        if (x - 1 >= 0 && y - 1 >= 0 && board[x - 1][y - 1] == 'M') {
            numOfMine++;
        }
        if (x - 1 >= 0 && y + 1 < col && board[x - 1][y + 1] == 'M') {
            numOfMine++;
        }
        if (x + 1 < row && y - 1 >= 0 && board[x + 1][y - 1] == 'M') {
            numOfMine++;
        }
        if (x + 1 < row && y + 1 < col && board[x + 1][y + 1] == 'M') {
            numOfMine++;
        }
        return numOfMine;
    }

}
