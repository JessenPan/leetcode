package org.jessenpan.leetcode.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S725SplitLinkedListInParts {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = countLen(root);
        int numOfEach = (int) Math.floor(len / k);
        ListNode[] splits = new ListNode[k];
        Queue<ListNode> queue = new LinkedList<>();

        ListNode current = root;
        int currentNum = 0;

        int i = 0;
        while (current != null) {

            if (numOfEach == 0) {
                currentNum = 1;
                len = len - 1;
            } else {
                if (len % numOfEach == 0) {
                    currentNum = numOfEach;
                } else {
                    currentNum = numOfEach + 1;
                }
                len = len - currentNum;
            }

            int j = 0;
            while (j < currentNum) {
                queue.add(current);
                current = current.next;
                j++;
            }

            ListNode eachHead = new ListNode(0);
            ListNode eachCurrent = eachHead;
            while (!queue.isEmpty()) {
                eachCurrent
            }
            
        }

        return splits;
    }

    private int countLen(ListNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }
}
