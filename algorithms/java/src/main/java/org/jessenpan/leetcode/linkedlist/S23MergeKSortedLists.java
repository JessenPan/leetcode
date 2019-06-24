package org.jessenpan.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S23MergeKSortedLists {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        List<Integer> listNodes = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                listNodes.add(list.val);
                list = list.next;
            }
        }

        Collections.sort(listNodes);

        ListNode head, current;
        head = current = new ListNode(0);

        for (Integer nodeVal : listNodes) {
            current.next = new ListNode(nodeVal);
            current = current.next;
        }

        return head.next;
    }

}
