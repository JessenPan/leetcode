package org.jessenpan.leetcode.disjointset;

/**
 * @author jessenpan
 * tag:disjointset
 */
public class S959RegionsCutBySlashes {

    //TODO study
    private class UnionFind {

        int[] parent;

        public UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < parent.length; i++)
                parent[i] = i;
        }

        public int find(int index) {
            while (index != parent[index])
                index = parent[index];
            return index;
        }

        public void merge(int p, int q) {
            int pRoot = find(p);
            int qRoot = find(q);
            parent[pRoot] = qRoot;
        }

    }

    public int regionsBySlashes(String[] grid) {
        int len = grid.length;
        // 总共有 4n * n 个 小区域块
        UnionFind uf = new UnionFind(4 * len * len);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int start = 4 * (i * len + j);
                switch (grid[i].charAt(j)) {
                    case ' ':
                        uf.merge(start, start + 1);
                        uf.merge(start + 2, start + 3);
                        uf.merge(start, start + 2);
                        break;
                    case '/':
                        uf.merge(start, start + 3);
                        uf.merge(start + 1, start + 2);
                        break;
                    case '\\':
                        uf.merge(start, start + 1);
                        uf.merge(start + 2, start + 3);
                        break;
                }
                if (i > 0) {
                    uf.merge(start, start - 4 * len + 2);
                }
                if (j > 0) {
                    uf.merge(start + 3, start - 3);
                }
            }
        }

        // 此时取出index = parent[index] 的节点即可 即算出有多少颗树就是有多少个区域
        int count = 0;
        for (int i = 0; i < uf.parent.length; i++) {
            if (i == uf.parent[i])
                count++;
        }
        return count;
    }

}
