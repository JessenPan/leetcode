package org.jessenpan.leetcode.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:map
 */
public class S146LruCache {

    //双向链表实现O(1)
    public static class LRUCache {

       static class Node {

            int key;
            int value;
            Node prev;
            Node next;
        }

        private void addNode(Node node) {
            node.prev = head;
            node.next = head.next;

            head.next.prev = node;
            head.next = node;
        }

        private void removeNode(Node node) {
            Node prev = node.prev;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;
        }

        private void moveToHead(Node node) {
            removeNode(node);
            addNode(node);
        }

        private Node popTail() {
            Node res = tail.prev;
            removeNode(res);
            return res;
        }

        private Map<Integer, Node> cache = new HashMap<>();
        private int size;
        private int capacity;
        private Node head, tail;

        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;

            head = new Node();

            tail = new Node();

            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            Node node = cache.get(key);
            if (node == null) {
                return -1;
            }

            moveToHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            Node node = cache.get(key);

            if (node == null) {
                Node newNode = new Node();
                newNode.key = key;
                newNode.value = value;

                cache.put(key, newNode);
                addNode(newNode);

                ++size;

                if (size > capacity) {
                    Node tail = popTail();
                    cache.remove(tail.key);
                    --size;
                }
            } else {
                node.value = value;
                moveToHead(node);
            }

        }
    }
}
