package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S445AddTwoNumbersII.*;

/**
 * @author jessenpan
 */
public class S445AddTwoNumbersIITest {

    private S445AddTwoNumbersII addTwoNumbersII = new S445AddTwoNumbersII();

    @Test
    public void test1() {
        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode h = addTwoNumbersII.addTwoNumbers(l1, l2);
    }

}
