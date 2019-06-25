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

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        int len = countLen(root);
        ListNode[] splits = new ListNode[k];
        Queue<ListNode> queue = new LinkedList<>();

        ListNode current = root;

        int i = 0;
        while (current != null) {

            double numOfEach = (double) len / k;
            if (numOfEach - (int) numOfEach != 0) {
                numOfEach = Math.ceil(numOfEach);
            }
            len = len - (int) numOfEach;
            k--;
            
            int j = 0;
            while (j < numOfEach) {
                queue.add(current);
                current = current.next;
                j++;
            }

            ListNode eachHead = new ListNode(0);
            ListNode eachCurrent = eachHead;
            while (!queue.isEmpty()) {
                eachCurrent.next = queue.poll();
                eachCurrent = eachCurrent.next;
            }
            eachCurrent.next = null;

            splits[i] = eachHead.next;
            i++;
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
