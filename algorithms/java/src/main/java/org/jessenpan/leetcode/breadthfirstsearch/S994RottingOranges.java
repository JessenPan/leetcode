package org.jessenpan.leetcode.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:breadthfirstsearch
 */
public class S994RottingOranges {

    public int orangesRotting(int[][] grid) {

        int row = grid.length, col = grid[0].length;
        int freshNum = 0;
        Queue<Position> queue = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    freshNum++;
                } else if (grid[i][j] == 2) {
                    queue.offer(new Position(i, j));
                }
            }
        }

        if (freshNum == 0) {
            return 0;
        }
        int time = 0;
        while (freshNum != 0) {
            Queue<Position> infects = new LinkedList<>();
            while (!queue.isEmpty()) {
                Position badOrange = queue.poll();
                if (badOrange.x - 1 >= 0 && grid[badOrange.x - 1][badOrange.y] == 1) {
                    grid[badOrange.x - 1][badOrange.y] = 2;
                    infects.offer(new Position(badOrange.x - 1, badOrange.y));
                    freshNum--;
                }
                if (badOrange.x + 1 < row && grid[badOrange.x + 1][badOrange.y] == 1) {
                    grid[badOrange.x + 1][badOrange.y] = 2;
                    infects.offer(new Position(badOrange.x + 1, badOrange.y));
                    freshNum--;
                }
                if (badOrange.y - 1 >= 0 && grid[badOrange.x][badOrange.y - 1] == 1) {
                    grid[badOrange.x][badOrange.y - 1] = 2;
                    infects.offer(new Position(badOrange.x, badOrange.y - 1));
                    freshNum--;
                }
                if (badOrange.y + 1 < col && grid[badOrange.x][badOrange.y + 1] == 1) {
                    grid[badOrange.x][badOrange.y + 1] = 2;
                    infects.offer(new Position(badOrange.x, badOrange.y + 1));
                    freshNum--;
                }
            }
            if (freshNum != 0 && infects.isEmpty()) {
                return -1;
            } else {
                queue = infects;
            }
            time++;
        }
        return time;
    }

    static class Position {

        int x, y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
