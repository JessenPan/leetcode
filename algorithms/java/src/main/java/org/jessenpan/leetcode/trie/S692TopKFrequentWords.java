package org.jessenpan.leetcode.trie;

import java.util.*;

/**
 * @author jessenpan
 */
public class S692TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String i : words) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue((Comparator<String>) (a, b) -> {
            if (map.get(a) == map.get(b)) {
                return a.compareTo(b);
            }
            return map.get(b) - map.get(a);
        });
        pq.addAll(map.keySet());
        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(pq.poll());
        }

        return res;
    }
}
