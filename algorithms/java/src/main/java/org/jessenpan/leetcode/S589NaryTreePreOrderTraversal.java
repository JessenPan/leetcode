package org.jessenpan.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:tree
 */
public class S589NaryTreePreOrderTraversal {

    public static class Node {

        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> preOrderOfTree = new LinkedList<>();
        Stack<Node> traversalStack = new Stack<>();
        Node current = root;
        while (current != null || !traversalStack.isEmpty()) {
            if (current != null) {
                preOrderOfTree.add(current.val);
                if (current.children != null && current.children.size() != 0) {
                    ListIterator<Node> listIterator = current.children.listIterator(current.children.size());
                    while (listIterator.hasPrevious()) {
                        traversalStack.push(listIterator.previous());
                    }
                }
            }
            if (!traversalStack.isEmpty()) {
                current = traversalStack.pop();
            } else {
                current = null;
            }
        }
        return preOrderOfTree;
    }

}
