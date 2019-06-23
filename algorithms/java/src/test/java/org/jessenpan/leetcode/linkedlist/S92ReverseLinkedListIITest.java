package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S92ReverseLinkedListII.*;

/**
 * @author jessenpan
 */
public class S92ReverseLinkedListIITest {

    private S92ReverseLinkedListII reverseLinkedListII = new S92ReverseLinkedListII();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode newHead = reverseLinkedListII.reverseBetween(head, 2, 4);
    }

}
