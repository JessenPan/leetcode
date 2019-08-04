package org.jessenpan.leetcode.greedy;

import java.util.*;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S767ReorganizeString {

    public String reorganizeString(String s) {

        char[] chars = s.toCharArray();
        int len = chars.length;
        Map<Character, Ele> record = new HashMap<>();
        for (int i = 0; i < len; i++) {
            Ele ele = record.computeIfAbsent(chars[i], Ele::new);
            ele.num++;
        }
        PriorityQueue<Ele> pQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.num, o1.num));
        pQueue.addAll(record.values());
        StringBuilder sb = new StringBuilder();

        while (!pQueue.isEmpty()) {

            int i = 0;
            List<Ele> eles = new ArrayList<>();
            while (i < 2) {
                Ele ele = pQueue.poll();
                if (ele == null && !eles.isEmpty()) {
                    return "";
                }
                if (ele == null) {
                    return sb.toString();
                }
                sb.append(ele.c);
                ele.num--;
                if (ele.num > 0) {
                    eles.add(ele);
                }
                i++;
            }
            pQueue.addAll(eles);
        }

        return sb.toString();
    }

    static class Ele {

        public Ele(char c) {
            this.c = c;
        }

        public Ele(char c, int num) {
            this.c = c;
            this.num = num;
        }

        char c;
        int num;
    }

}
