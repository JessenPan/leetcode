package org.jessenpan.leetcode.linkedlist;

import org.junit.Test;

import static org.jessenpan.leetcode.linkedlist.S430FlattenAMultilevelDoublyLinkedList.*;

/**
 * @author jessenpan
 */
public class S430FlattenAMultilevelDoublyLinkedListTest {

    private S430FlattenAMultilevelDoublyLinkedList flattenAMultilevelDoublyLinkedList = new S430FlattenAMultilevelDoublyLinkedList();

    @Test
    public void test1() {
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.child = node3;
        head.next = node2;
        node2.prev = head;
        Node newHead = flattenAMultilevelDoublyLinkedList.flatten(head);
    }

}
