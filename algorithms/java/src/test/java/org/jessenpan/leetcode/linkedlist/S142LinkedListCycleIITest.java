package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S142LinkedListCycleII.*;

/**
 * @author jessenpan
 */
public class S142LinkedListCycleIITest {

    private S142LinkedListCycleII linkedListCycleII = new S142LinkedListCycleII();

    @Test
    public void test1() {
        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(4))));
        linkedListCycleII.detectCycle(head);
    }

}
