package org.jessenpan.leetcode.heap;

import java.util.*;

/**
 * @author jessenpan
 */
public class S347TopKFrequentElements {

    static class SortInteger {

        int c;

        int times;

        SortInteger(int c, int times) {
            this.c = c;
            this.times = times;
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, SortInteger> record = new HashMap<>();
        for (int num : nums) {

            SortInteger sc = record.computeIfAbsent(num, c -> new SortInteger(c, 0));
            sc.times++;
        }

        PriorityQueue<SortInteger> pQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.times, o1.times));
        record.forEach((c, sc) -> {
            pQueue.add(sc);
        });

        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i != k) {
            i++;
            list.add(pQueue.poll().c);
        }

        return list;
    }

}
