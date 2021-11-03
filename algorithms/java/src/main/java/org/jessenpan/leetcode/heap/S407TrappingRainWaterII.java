package org.jessenpan.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:heap
 */
public class S407TrappingRainWaterII {

    //TODO
    public int trapRainWater(int[][] heights) {
        if (heights == null || heights.length == 0)
            return 0;
        int n = heights.length;
        int m = heights[0].length;
        // 用一个vis数组来标记这个位置有没有被访问过
        boolean[][] vis = new boolean[n][m];
        // 优先队列中存放三元组 [x,y,h] 坐标和高度
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));

        // 先把最外一圈放进去
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    pq.offer(new int[] { i, j, heights[i][j] });
                    vis[i][j] = true;
                }
            }
        }
        int res = 0;
        // 方向数组，把dx和dy压缩成一维来
        int[] dirs = { -1, 0, 1, 0, -1 };
        while (!pq.isEmpty()) {
            int[] poll = pq.poll();
            // 看一下四个方向
            for (int k = 0; k < 4; k++) {
                int nx = poll[0] + dirs[k];
                int ny = poll[1] + dirs[k + 1];
                // 如果位置合法且没访问过
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !vis[nx][ny]) {
                    // 如果外围这一圈中最小的比当前这个还高，那就说明能往里面灌水啊
                    if (poll[2] > heights[nx][ny]) {
                        res += poll[2] - heights[nx][ny];
                    }
                    // 如果灌水高度得是你灌水后的高度了，如果没灌水也要取高的
                    pq.offer(new int[] { nx, ny, Math.max(heights[nx][ny], poll[2]) });
                    vis[nx][ny] = true;
                }
            }
        }
        return res;
    }

}
