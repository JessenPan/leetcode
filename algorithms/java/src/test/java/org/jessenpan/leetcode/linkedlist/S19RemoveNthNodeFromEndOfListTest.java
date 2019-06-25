package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S19RemoveNthNodeFromEndOfList.*;

/**
 * @author jessenpan
 */
public class S19RemoveNthNodeFromEndOfListTest {

    private S19RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new S19RemoveNthNodeFromEndOfList();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode newHead = removeNthNodeFromEndOfList.removeNthFromEnd(head, 2);
    }

}
