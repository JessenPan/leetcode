package org.jessenpan.leetcode.design;

import org.jessenpan.leetcode.linkedlist.S707DesignLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S707DesignLinkedListTest {

    private S707DesignLinkedList.MyLinkedList linkedList = new S707DesignLinkedList.MyLinkedList();

    @Test
    public void test() {
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);
        assertEquals(2, linkedList.get(1));
        linkedList.deleteAtIndex(1);
        assertEquals(3, linkedList.get(1));
    }

    @Test
    public void test1() {
        linkedList.addAtHead(1);
        linkedList.addAtIndex(1, 2);
        assertEquals(2, linkedList.get(1));
        assertEquals(1, linkedList.get(0));
        assertEquals(-1, linkedList.get(2));
    }

    @Test
    public void test2() {
        linkedList.addAtHead(38);
        linkedList.addAtHead(45);
        linkedList.deleteAtIndex(2);
    }

}
