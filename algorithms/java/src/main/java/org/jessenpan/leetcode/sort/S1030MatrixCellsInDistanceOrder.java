package org.jessenpan.leetcode.sort;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:sort
 */
public class S1030MatrixCellsInDistanceOrder {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {

        PriorityQueue<Position> pQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.distance));

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                Position position = new Position(i, j);
                position.distance = Math.abs(i - r0) + Math.abs(j - c0);
                pQueue.add(position);
            }
        }

        int[][] cells = new int[pQueue.size()][2];
        int i = 0;
        while (!pQueue.isEmpty()) {
            Position pos = pQueue.poll();
            cells[i] = new int[] { pos.x, pos.y };
            i++;
        }
        return cells;
    }

    static class Position {

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x, y;
        int distance;
    }

}
