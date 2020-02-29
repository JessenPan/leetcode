package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S427ConstructQuadTree {

    static class Node {

        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

    public Node construct(int[][] grid) {
        int len = grid.length;
        if (len == 1) {
            return new Node(grid[0][0] != 0, true);
        }
        return build(grid, 0, 0, len, len);
    }

    private Node build(int[][] grid, int leftX, int leftY, int rightX, int rightY) {

        if (rightX - leftX == 1) {
            return new Node(grid[rightX][rightY] != 0, true);
        }

        int midX = (rightX - leftX) / 2 + leftX;
        int midY = (rightY - leftY) / 2 + leftY;
        int[] sums = new int[4];
        sums[0] = sum(leftX, leftY, midX, midY, grid);
        sums[1] = sum(leftX, midY, midX, rightY, grid);
        sums[2] = sum(midX, leftY, rightX, midY, grid);
        sums[3] = sum(midX, midY, rightX, rightY, grid);

        int cnt = sums[0] + sums[1] + sums[2] + sums[3];
        int shouldSum = ((rightX - leftX) * (rightY - leftY));
        if (cnt == 0 || cnt == shouldSum) {
            return new Node(cnt != 0, true);
        }
        Node topLeft;
        if (sums[0] == 0 || sums[0] == shouldSum / 4) {
            topLeft = new Node(sums[0] != 0, true);
        } else {
            topLeft = build(grid, leftX, leftY, midX, midY);
        }

        Node topRight;
        if (sums[1] == 0 || sums[1] == shouldSum / 4) {
            topRight = new Node(sums[1] != 0, true);
        } else {
            topRight = build(grid, leftX, midY, midX, rightY);
        }

        Node bottomLeft;
        if (sums[2] == 0 || sums[2] == shouldSum / 4) {
            bottomLeft = new Node(sums[2] != 0, true);
        } else {
            bottomLeft = build(grid, midX, leftY, rightX, midY);
        }
        Node bottomRight;
        if (sums[3] == 0 || sums[3] == shouldSum / 4) {
            bottomRight = new Node(sums[3] != 0, true);
        } else {
            bottomRight = build(grid, midX, midY, rightX, rightY);
        }

        return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
    }

    private int sum(int leftX, int leftY, int rightX, int rightY, int[][] grid) {
        int sum = 0;
        for (int i = leftX; i < rightX; i++) {
            for (int j = leftY; j < rightY; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }

}
