package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S25ReverseNodesInKGroup.*;

/**
 * @author jessenpan
 */
public class S25ReverseNodesInKGroupTest {

    private S25ReverseNodesInKGroup reverseNodesInKGroup = new S25ReverseNodesInKGroup();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode newHead = reverseNodesInKGroup.reverseKGroup(head, 2);
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode newHead = reverseNodesInKGroup.reverseKGroup(head, 3);
    }

}
