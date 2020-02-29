package org.jessenpan.leetcode.disjointset;

/**
 * @author jessenpan
 * tag:disjoinset
 */
public class S684RedundantConnection {

    //TODO 并查集的方案，没有做路径压缩
    public int[] findRedundantConnection(int[][] edges) {
        int[] res = new int[2];
        Union union = new Union(edges.length);

        // 先把第一条线段， 加入到集合中
        union.unionArea(edges[0][0], edges[0][1]);
        for (int i = 1; i < edges.length; i++) {
            if (union.isConnect(edges[i][0], edges[i][1])) {
                res[0] = edges[i][0];
                res[1] = edges[i][1];
            } else {
                union.unionArea(edges[i][0], edges[i][1]);
            }
        }
        return res;
    }

    static class Union {

        int[] parent;

        public Union(int total) {
            parent = new int[total + 1];
            for (int i = 0; i <= total; i++) {
                parent[i] = i;
            }
        }

        // 找 root
        public int find(int x) {
            while (x != parent[x]) {
                x = parent[parent[x]];
            }
            return x;
        }

        // 是否有相同的root
        public boolean isConnect(int x, int y) {
            return find(x) == find(y);
        }

        // 合并区域
        public void unionArea(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            parent[rootY] = rootX;
        }
    }

}
