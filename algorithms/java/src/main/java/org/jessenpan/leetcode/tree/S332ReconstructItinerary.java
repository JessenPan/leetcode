package org.jessenpan.leetcode.tree;

import java.util.*;

/**
 * @author jessenpan
 * tag:tree
 */
public class S332ReconstructItinerary {

    //TODO study
    public List<String> findItinerary(List<List<String>> tickets) {
        // 因为逆序插入，所以用链表
        List<String> ans = new LinkedList<>();

        if (tickets == null || tickets.size() == 0)
            return ans;

        Map<String, PriorityQueue<String>> graph = new HashMap<>();

        for (List<String> pair : tickets) {
            // 因为涉及删除操作，我们用链表
            PriorityQueue<String> nbr = graph.computeIfAbsent(pair.get(0), k -> new PriorityQueue<>());
            nbr.add(pair.get(1));
        }

        // 按目的顶点排序

        visit(graph, "JFK", ans);

        return ans;
    }

    // DFS方式遍历图，当走到不能走为止，再将节点加入到答案
    private void visit(Map<String, PriorityQueue<String>> graph, String src, List<String> ans) {

        Stack<String> stack = new Stack<>();

        stack.push(src);

        while (!stack.isEmpty()) {
            PriorityQueue<String> nbr;

            while ((nbr = graph.get(stack.peek())) != null && nbr.size() > 0) {
                stack.push(nbr.poll());
            }
            ans.add(0, stack.pop());
        }
    }

}
