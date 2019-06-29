package org.jessenpan.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:heap
 */
public class S451SortCharactersByFrequency {

    static class SortChar {

        char c;

        int times;

        SortChar(char c, int times) {
            this.c = c;
            this.times = times;
        }
    }

    public String frequencySort(String s) {
        int len = s.length();
        Map<Character, SortChar> record = new HashMap<>();
        for (int i = 0; i < len; i++) {
            SortChar sc = record.computeIfAbsent(s.charAt(i), c -> new SortChar(c, 0));
            sc.times++;
        }

        PriorityQueue<SortChar> pQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.times, o1.times));
        record.forEach((c, sc) -> {
            pQueue.add(sc);
        });

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (!pQueue.isEmpty()) {
            SortChar sc = pQueue.poll();
            i = 0;
            while (i < sc.times) {
                i++;
                sb.append(sc.c);
            }
        }

        return sb.toString();

    }

}
