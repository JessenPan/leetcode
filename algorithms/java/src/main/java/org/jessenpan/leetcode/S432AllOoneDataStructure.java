package org.jessenpan.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author jessenpan
 * tag:design
 */
public class S432AllOoneDataStructure {

    public static class AllOne {

        private Map<String, Integer> map1;
        private Map<Integer, DLinkedNode> map2;
        private DLinkedNode head;
        private DLinkedNode tail;

        /**
         * Initialize your data structure here.
         */
        public AllOne() {
            map1 = new HashMap<>();
            map2 = new HashMap<>();
            head = new DLinkedNode(0);
            tail = new DLinkedNode(0);
            head.next = tail;
            tail.pre = head;
        }

        /**
         * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
         */
        public void inc(String key) {
            // 如果map1中包含key
            if (map1.containsKey(key)) {
                int val = map1.get(key);
                map1.put(key, val + 1);
                DLinkedNode node = map2.get(val);
                node.keys.remove(key);
                DLinkedNode preNode = node.pre;
                if (preNode == head || preNode.val > val + 1) {
                    DLinkedNode newNode = new DLinkedNode(val + 1);
                    newNode.keys.add(key);
                    newNode.next = node;
                    newNode.pre = preNode;
                    preNode.next = newNode;
                    node.pre = newNode;
                    map2.put(val + 1, newNode);
                    preNode = newNode;
                } else {    // 如果当前已经有统计次数为val+1的节点，只需key加入到Set中即可
                    preNode.keys.add(key);
                }
                // 如果原节点在移除key后size为0，则删除该节点，并在map2中删除val->node的映射
                if (node.keys.size() == 0) {
                    preNode.next = node.next;
                    node.next.pre = preNode;
                    map2.remove(val);
                }
            } else {    // map1中不包含key
                map1.put(key, 1);
                DLinkedNode node = map2.get(1);
                if (node == null) {
                    DLinkedNode newNode = new DLinkedNode(1);
                    newNode.keys.add(key);
                    newNode.next = tail;
                    newNode.pre = tail.pre;
                    tail.pre.next = newNode;
                    tail.pre = newNode;
                    map2.put(1, newNode);
                } else {
                    node.keys.add(key);
                }
            }
        }

        public void dec(String key) {
            if (map1.containsKey(key)) {
                int val = map1.get(key);
                DLinkedNode node = map2.get(val);
                node.keys.remove(key);
                if (val == 1) {
                    map1.remove(key);
                } else {
                    map1.put(key, val - 1);
                    DLinkedNode nextNode = node.next;
                    if (nextNode == tail || nextNode.val < val - 1) {
                        DLinkedNode newNode = new DLinkedNode(val - 1);
                        newNode.keys.add(key);
                        newNode.pre = node;
                        newNode.next = nextNode;
                        node.next = newNode;
                        nextNode.pre = newNode;
                        map2.put(val - 1, newNode);
                    } else {    // 下一个节点的统计次数为val-1，将key加到下一节点的keys Set中
                        nextNode.keys.add(key);
                    }
                }
                // 如果当前节点只包含这一个key，删除后size为0，则将当前节点删除，并更新map2
                if (node.keys.size() == 0) {
                    node.pre.next = node.next;
                    node.next.pre = node.pre;
                    map2.remove(val);
                }
            }
        }

        public String getMaxKey() {
            if (head.next == tail) {
                return "";
            } else {
                return head.next.keys.iterator().next();
            }
        }

        public String getMinKey() {
            if (tail.pre == head) {
                return "";
            } else {
                return tail.pre.keys.iterator().next();
            }
        }

        private static class DLinkedNode {

            int val;
            Set<String> keys;
            DLinkedNode pre, next;

            public DLinkedNode(int val) {
                this.val = val;
                this.keys = new HashSet<>();
            }
        }
    }
}
