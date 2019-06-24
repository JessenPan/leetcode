package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S24SwapNodesInPairs.*;

/**
 * @author jessenpan
 */
public class S24SwapNodesInPairsTest {

    private S24SwapNodesInPairs swapNodesInPairs = new S24SwapNodesInPairs();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode newHead = swapNodesInPairs.swapPairs(head);
    }

}
