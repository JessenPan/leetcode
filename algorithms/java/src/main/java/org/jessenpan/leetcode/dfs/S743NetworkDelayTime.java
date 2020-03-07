package org.jessenpan.leetcode.dfs;

import java.util.*;

/**
 * @author jessenpan
 * tag:dfs
 */
public class S743NetworkDelayTime {

    private Map<Integer, Integer> dist;
    private Map<Integer, List<int[]>> graph = new HashMap<>();

    public int networkDelayTime(int[][] times, int N, int K) {

        for (int[] edge : times) {
            if (!graph.containsKey(edge[0])) {
                graph.put(edge[0], new ArrayList<>());
            }
            //0表示时间,1表示节点
            graph.get(edge[0]).add(new int[] { edge[2], edge[1] });
        }
        for (int node : graph.keySet()) {
            graph.get(node).sort(Comparator.comparingInt(a -> a[0]));
        }
        dist = new HashMap<>();
        for (int node = 1; node <= N; ++node) {
            dist.put(node, Integer.MAX_VALUE);
        }

        dfs(K, 0);
        int ans = 0;
        for (int cand : dist.values()) {
            if (cand == Integer.MAX_VALUE) {
                return -1;
            }
            ans = Math.max(ans, cand);
        }
        return ans;
    }

    public void dfs(int node, int elapsed) {
        if (elapsed >= dist.get(node)) {
            return;
        }
        dist.put(node, elapsed);
        if (graph.containsKey(node)) {
            for (int[] info : graph.get(node)) {
                dfs(info[1], elapsed + info[0]);
            }
        }
    }

}
