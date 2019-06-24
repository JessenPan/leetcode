package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S82RemoveDuplicatesFromSortedListII.*;

/**
 * @author jessenpan
 */
public class S82RemoveDuplicatesFromSortedListIITest {

    private S82RemoveDuplicatesFromSortedListII removeDuplicatesFromSortedListII = new S82RemoveDuplicatesFromSortedListII();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));
        ListNode newHead = removeDuplicatesFromSortedListII.deleteDuplicates(head);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))));
        ListNode newHead = removeDuplicatesFromSortedListII.deleteDuplicates(head);
    }

}
