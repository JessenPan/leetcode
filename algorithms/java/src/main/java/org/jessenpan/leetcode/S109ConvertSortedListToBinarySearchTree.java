package org.jessenpan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:depth first search
 */
public class S109ConvertSortedListToBinarySearchTree {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        Integer[] array = linkListToArray(head);
        return sortedListToBST(array);
    }

    private TreeNode sortedListToBST(Integer[] array) {
        int length = array.length;
        if (length == 1) {
            return new TreeNode(array[0]);
        }
        int parentNodePosition = length / 2;
        TreeNode node = new TreeNode(array[parentNodePosition]);
        Integer[] leftArray = new Integer[parentNodePosition];
        System.arraycopy(array, 0, leftArray, 0, parentNodePosition);
        node.left = sortedListToBST(leftArray);
        if (length - parentNodePosition - 1 > 0) {
            Integer[] rightArray = new Integer[length - parentNodePosition - 1];
            System.arraycopy(array, parentNodePosition + 1, rightArray, 0, length - parentNodePosition - 1);
            node.right = sortedListToBST(rightArray);
        }
        return node;
    }

    private Integer[] linkListToArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.toArray(new Integer[0]);
    }
}
