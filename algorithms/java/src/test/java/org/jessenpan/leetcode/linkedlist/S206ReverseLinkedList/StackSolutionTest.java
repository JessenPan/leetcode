package org.jessenpan.leetcode.linkedlist.S206ReverseLinkedList;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class StackSolutionTest {

    @Test
    public void test() {
        StackSolution.ListNode first = new StackSolution.ListNode(1);
        StackSolution.ListNode second = new StackSolution.ListNode(2);
        StackSolution.ListNode third = new StackSolution.ListNode(3);
        StackSolution.ListNode fourth = new StackSolution.ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;

        StackSolution solution = new StackSolution();
        StackSolution.ListNode tHead = solution.reverseList(first);

        //直接比较地址
        Assert.assertTrue(tHead == fourth);
        Assert.assertTrue(tHead.next == third);
        Assert.assertTrue(tHead.next.next == second);
        Assert.assertTrue(tHead.next.next.next == first);

    }

}
