package org.jessenpan.leetcode.dfs;

/**
 * @author jessenpan
 * tag:disjointset
 */
public class S200NumberOfIslands {

    int row, col;
    int[][] visited;
    int count = 0;
    char[][] grid;

    //TODO 对于一个无向图的一个非常好的，深度优先遍历
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        //2个元素   0表示是否有访问(1表示已访问)，1表示岛屿号
        row = grid.length;
        col = grid[0].length;
        this.grid = grid;
        visited = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }
                if (visited[i][j] == 1) {
                    continue;
                }

                visit(i, j, count);
                count++;
            }
        }
        return count;
    }

    private void visit(int x, int y, int count) {
        if (x < 0 || x >= row || y < 0 || y >= col) {
            return;
        }
        if (grid[x][y] == '0') {
            return;
        }
        if (visited[x][y] == 1) {
            return;
        }
        visited[x][y] = 1;
        visit(x - 1, y, count);
        visit(x + 1, y, count);
        visit(x, y - 1, count);
        visit(x, y + 1, count);
    }

}
