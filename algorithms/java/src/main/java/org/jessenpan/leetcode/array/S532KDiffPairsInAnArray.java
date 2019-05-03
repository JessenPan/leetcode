package org.jessenpan.leetcode.array;

import java.util.*;

/**
 * @author jessenpan
 * tag:array
 */
public class S532KDiffPairsInAnArray {

    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        int cnt = 0;
        Set<Pair> record = new HashSet<>();
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            Integer numCnt = numMap.get(num);
            numCnt = numCnt == null ? 1 : numCnt + 1;
            numMap.put(num, numCnt);
        }
        for (int num : nums) {
            if (k == 0) {
                Integer numCnt = numMap.get(num);
                Pair pair = new Pair(num, num);
                if (numCnt >= 2 && !record.contains(pair)) {
                    cnt++;
                    record.add(pair);
                }
            } else {
                int other = num - k;
                Pair pair = new Pair(other, num);
                if (numMap.get(other) != null && !record.contains(pair)) {
                    cnt++;
                    record.add(pair);
                }
                other = num + k;
                pair = new Pair(num, other);
                if (numMap.get(other) != null && !record.contains(pair)) {
                    cnt++;
                    record.add(pair);
                }
            }
        }
        return cnt;
    }

    static class Pair {

        int min;
        int max;

        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair pair = (Pair) o;
            return min == pair.min && max == pair.max;
        }

        @Override
        public int hashCode() {
            return Objects.hash(min, max);
        }
    }
}
