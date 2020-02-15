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

        static class CollectionNode {

            Set<String> set = new HashSet<>();
            CollectionNode prev, next;
            int val;
        }

        Map<String, CollectionNode> record = new HashMap<>();

        CollectionNode head, last;
        
        public AllOne() {
        }

        public void inc(String key) {
            if (record.get(key) == null) {

            }
        }

        public void dec(String key) {

        }

        public String getMaxKey() {
            return "";
        }

        public String getMinKey() {
            return "";
        }
    }

}
