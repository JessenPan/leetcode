package org.jessenpan.leetcode.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:sort
 */
public class S386LexicographicalNumbers {

    static class Item {

        int i;
        String str;

        Item(int i, String str) {
            this.i = i;
            this.str = str;
        }
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Item> queue = new PriorityQueue<>(new Comparator<Item>() {

            @Override
            public int compare(Item o1, Item o2) {
                if (o1.i == o2.i) {
                    return 0;
                }
                if (o1.str.startsWith(o2.str)) {
                    return 1;
                }
                if (o2.str.startsWith(o1.str)) {
                    return -1;
                }
                int minLen = Math.min(o1.str.length(), o2.str.length());
                for (int i = 0; i < minLen; i++) {
                    if (o1.str.charAt(i) > o2.str.charAt(i)) {
                        return 1;
                    } else if (o1.str.charAt(i) < o2.str.charAt(i)) {
                        return -1;
                    }
                }
                return o1.str.length() > o2.str.length() ? 1 : -1;
            }
        });

        for (int i = 0; i < n; i++) {
            queue.add(new Item(i + 1, String.valueOf(i + 1)));
        }

        while (!queue.isEmpty()) {
            list.add(queue.poll().i);
        }
        return list;
    }

}
