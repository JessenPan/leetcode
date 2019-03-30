package org.jessenpan.leetcode.design;

/**
 * @author jessenpan
 * tag:design
 */
public class S707DesignLinkedList {

    public static class MyLinkedList {

        private static class Node {

            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        private Node head;

        private Node end;

        private int length = 0;

        public MyLinkedList() {
        }

        public int get(int index) {
            if (head == null || index + 1 > length) {
                return -1;
            }
            if (index == 0) {
                return head.value;
            }
            int indexCount = 0;
            Node current = head;
            while (indexCount < index) {
                current = current.next;
                indexCount++;
            }
            return current.value;
        }

        public void addAtHead(int val) {
            if (head == null) {
                head = end = new Node(val);
                length = 1;
                return;
            }
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            length++;
        }

        public void addAtTail(int val) {
            if (end == null) {
                head = end = new Node(val);
                length = 1;
                return;
            }
            internalAddAtTail(val);
        }

        public void addAtIndex(int index, int val) {
            if (index > length) {
                return;
            }
            if (length == 0 || index == 0) {
                addAtHead(val);
                return;
            }
            if (index == length) {
                internalAddAtTail(val);
                return;
            }
            int indexCount = 0;
            Node current = head;

            while (indexCount < (index - 1)) {
                current = current.next;
                indexCount++;
            }
            Node newNode = new Node(val);
            newNode.next = current.next;
            current.next = newNode;
            length++;
        }

        private void internalAddAtTail(int val) {
            Node newNode = new Node(val);
            end.next = newNode;
            end = newNode;
            length++;
        }

        public void deleteAtIndex(int index) {
            if (index + 1 > length || head == null) {
                return;
            }
            if (index == 0 && head == end) {
                head = end = null;
                length--;
                return;
            }
            if (index == 0) {
                head = head.next;
                length--;
                return;
            }
            int indexCount = 0;
            Node current = head;
            while (indexCount < (index - 1)) {
                indexCount++;
                current = current.next;
            }
            if (index + 1 == length) {
                end = current;
            }
            current.next = current.next.next;
            length--;
        }
    }
}
