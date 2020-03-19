package org.jessenpan.leetcode.disjointset;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:disjointset
 */
public class S947MostStonesRemovedWithSameRowOrColumn {

    public int removeStones(int[][] stones) {
        int N = stones.length;
        DSU dsu = new DSU(20000);

        for (int[] stone : stones) {
            dsu.union(stone[0], stone[1] + 10000);
        }

        Set<Integer> groupId = new HashSet<>();
        for (int[] stone : stones) {
            groupId.add(dsu.find(stone[0]));
        }

        return N - groupId.size();
    }

    static class DSU {

        int[] parent;

        public DSU(int N) {
            parent = new int[N];
            for (int i = 0; i < N; ++i) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {
            parent[find(x)] = find(y);
        }
    }

}
