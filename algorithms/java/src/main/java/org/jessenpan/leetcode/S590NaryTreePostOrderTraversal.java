package org.jessenpan.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:tree,stack
 */
public class S590NaryTreePostOrderTraversal {

    public static class Node {

        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postOrder(Node root) {
        List<Integer> postOrder = new LinkedList<>();
        Stack<Node> traversalStack = new Stack<>();
        Node current = root;
        while (current != null || !traversalStack.isEmpty()) {

            if (current != null) {
                traversalStack.push(current);
                if (current.children != null && current.children.size() > 0) {
                    ListIterator<Node> listItr = current.children.listIterator(current.children.size());
                    while (listItr.hasPrevious()) {
                        traversalStack.push(listItr.previous());
                    }
                    current.children = null;
                } else if (!traversalStack.isEmpty()) {
                    postOrder.add(traversalStack.pop().val);
                }
            }

            if (!traversalStack.isEmpty()) {
                current = traversalStack.pop();
            } else {
                current = null;
            }
        }

        return postOrder;
    }

}
