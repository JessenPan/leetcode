package org.jessenpan.leetcode.linkedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S817LinkedListComponents {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    public int numComponents(ListNode head, int[] g) {
        Set<Integer> record = new HashSet<>();
        Arrays.stream(g).forEach(record::add);

        int num = 0;
        ListNode current = head;
        while (current != null) {

            if (record.contains(current.val)) {
                if (current.next == null) {
                    num++;
                } else if (!record.contains(current.next.val)) {
                    num++;
                }
            }

            current = current.next;
        }

        return num;
    }

}
