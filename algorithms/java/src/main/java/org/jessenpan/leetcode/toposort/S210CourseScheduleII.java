package org.jessenpan.leetcode.toposort;

import java.util.*;

/**
 * @author jessenpan
 * tag:toposort
 */
public class S210CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        if (numCourses == 1) {
            return new int[] {0};
        }
        int edges = prerequisites.length;

        int[] indegrees = new int[numCourses];
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            indegrees[prerequisite[0]]++;
            graph.computeIfAbsent(prerequisite[1], integer -> new ArrayList<>());
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }

        List<Integer> list = new ArrayList<>();
        Queue<Integer> setOfZeroIndegree = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (0 == indegrees[i]) {
                setOfZeroIndegree.offer(i);
            }
        }
        while (!setOfZeroIndegree.isEmpty()) {
            int v = setOfZeroIndegree.poll();
            list.add(v);
            // 遍历由v引出的所有边
            List<Integer> indegreeEdges = graph.get(v);
            if (indegreeEdges == null) {
                continue;
            }
            for (int w : indegreeEdges) {
                // 将该边从图中移除，通过减少边的数量来表示
                edges--;
                // 如果入度为0，那么加入入度为0的集合
                if (0 == --indegrees[w]) {
                    setOfZeroIndegree.offer(w);
                }
            }
        }
        // 如果此时图中还存在边，那么说明图中含有环路
        if (0 != edges) {
            return new int[] {};
        } else {
            int[] rs = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                rs[i] = list.get(i);
            }
            return rs;
        }
    }
}
