package org.jessenpan.leetcode.random;

import java.util.*;

/**
 * @author jessenpan
 * tag:random
 */
public class S710RandomPickWithBlacklist {

    static class Solution {

        Map<Integer, Integer> m;
        Random r;
        int wlen;

        public Solution(int n, int[] b) {
            m = new HashMap<>();
            r = new Random();
            wlen = n - b.length;
            Set<Integer> w = new HashSet<>();
            for (int i = wlen; i < n; i++) {
                w.add(i);
            }
            for (int x : b) {
                w.remove(x);
            }
            Iterator<Integer> wi = w.iterator();
            for (int x : b) {
                if (x < wlen) {
                    m.put(x, wi.next());
                }
            }
        }

        public int pick() {
            int k = r.nextInt(wlen);
            return m.getOrDefault(k, k);
        }
    }
}
