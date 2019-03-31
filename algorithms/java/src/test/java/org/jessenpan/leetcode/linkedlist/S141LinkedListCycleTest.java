package org.jessenpan.leetcode.linkedlist;

import org.jessenpan.leetcode.linkedlist.S141LinkedListCycle;
import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S141LinkedListCycle.*;

/**
 * @author jessenpan
 */
public class S141LinkedListCycleTest {

    private S141LinkedListCycle linkedListCycle = new S141LinkedListCycle();
    
    @Test
    public void test1(){

        ListNode node1 = new ListNode(3);
        ListNode node2=new ListNode(2);
        node1.next=node2;
        node2.next = new ListNode(0, new ListNode(-4, node2));
        linkedListCycle.hasCycle(node1);
    }

}
