package org.jessenpan.leetcode.bfs;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author jessenpan
 * tag:tree
 */
public class S429NaryTreeLevelOrderTraversal {

    public static class Node {

        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> multiLeveledList = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        multiLeveledList.add(Collections.singletonList(root.val));
        while (!queue.isEmpty()) {
            List<Integer> theLevelList = new LinkedList<>();
            List<Node> theNextNode = new LinkedList<>();
            while (!queue.isEmpty()) {
                List<Node> theChildren = queue.poll().children;
                if (theChildren != null && theChildren.size() > 0) {
                    theNextNode.addAll(theChildren);
                    theLevelList.addAll(theChildren.parallelStream().map(node -> node.val).collect(Collectors.toList()));
                }
            }
            if (theLevelList.size() > 0) {
                multiLeveledList.add(theLevelList);
            }
            if (theNextNode.size() > 0) {
                theNextNode.forEach(queue::offer);
            }
        }
        return multiLeveledList;
    }

}
