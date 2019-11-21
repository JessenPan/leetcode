package org.jessenpan.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:recursion
 */
public class S797AllPathsFromSourceToTarget {

    private List<List<Integer>> paths = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        int len = graph[0].length;
        for (int i = 0; i < len; i++) {
            List<Integer> path = new ArrayList<>();
            path.add(0);
            path.add(graph[0][i]);
            findPath(graph, graph[0][i], path);
        }
        return paths;
    }

    private void findPath(int[][] graph, int idx, List<Integer> path) {
        int[] array = graph[idx];
        if (array.length == 0) {
            paths.add(path);
            return;
        }
        int len = array.length;
        for (int i = 0; i < len; i++) {
            List<Integer> newPath = new ArrayList<>(path);
            newPath.add(array[i]);
            findPath(graph, array[i], newPath);
        }
    }
}
