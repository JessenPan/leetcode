package org.jessenpan.leetcode.dsu;

/**
 * @author jessenpan
 * tag:disjointset
 */
public class S685RedundantConnectionII {

    private int[] parent = null;

    private int find(int u) {

        while (u != parent[u]) {
            //压缩路径
            parent[u] = parent[parent[u]];
            u = parent[u];

        }
        return u;
    }

    public int[] findRedundantDirectedConnection(int[][] edges) {

        int[] backedge = new int[2];//存放最后一个后向边(环)
        int[] pending = new int[2];//存放最后一个重复的父节点
        parent = new int[edges.length + 1];

        for (int[] edge : edges) {

            if (parent[edge[1]] == 0) {//合并有向边
                parent[edge[1]] = edge[0];
            } else {//有重复的父节点
                pending = new int[] { edge[0], edge[1] };
                backedge = new int[] { parent[edge[1]], edge[1] };
                edge[1] = 0;
            }
        }
        for (int i = 0; i <= edges.length; i++) {
            parent[i] = i;
        }

        for (int[] e : edges) {

            if (e[1] == 0) {
                continue;
            }
            //判断有没有环
            if (find(e[0]) == e[1]) {
                return backedge[0] != 0 ? backedge : e;
            }
            parent[e[1]] = e[0];
        }

        return pending;
    }
}
