package org.jessenpan.leetcode.map;

import java.util.*;

/**
 * @author jessenpan
 * tag:map
 */
public class S731MyCalendarII {

    static class MyCalendarTwo {

        SortedMap<Integer, List<Integer>> sortedMap = new TreeMap<>();

        public MyCalendarTwo() {
        }

        public boolean book(int start, int end) {
            if (sortedMap.isEmpty()) {
                sortedMap.computeIfAbsent(start, integer -> new ArrayList<>());
                sortedMap.get(start).add(end);
                return true;
            }
            Iterator<Integer> starts = sortedMap.keySet().iterator();
            int cnt;
            while (starts.hasNext()) {
                cnt = 0;
                Integer currentStart = starts.next();
                if (end < currentStart) {
                    break;
                }
                List<Integer> currentEnds = sortedMap.get(currentStart);
                for (Integer currentEnd : currentEnds) {
                    if (start >= currentStart && start < currentEnd) {
                        cnt++;
                    }
                    if (end > currentStart && end < currentEnd) {
                        cnt++;
                    }
                    if (cnt >= 2) {
                        return false;
                    }
                }
            }
            sortedMap.computeIfAbsent(start, integer -> new ArrayList<>());
            sortedMap.get(start).add(end);
            return true;
        }
    }

}
