package org.jessenpan.leetcode.map;

import java.util.*;

/**
 * @author jessenpan
 * tag:map
 */
public class S981TimeBasedKeyValueStore {

    public static class TimeMap {

        Map<String, Map<Integer, String>> record = new HashMap<>();
        Map<String, List<Integer>> map = new HashMap<>();

        public TimeMap() {
        }

        public void set(String key, String value, int timestamp) {
            record.putIfAbsent(key, new HashMap<>());
            record.get(key).put(timestamp, value);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(timestamp);
        }

        public String get(String key, int timestamp) {
            List<Integer> list = map.get(key);
            if (list == null || list.isEmpty()) {
                return "";
            }
            int len = list.size();
            if (record.get(key).get(timestamp) != null) {
                return record.get(key).get(timestamp);
            }
            int low = 0, high = len - 1, mid;
            if (timestamp < list.get(0)) {
                return "";
            }
            if (list.get(high) < timestamp) {
                return record.get(key).get(list.get(high));
            }
            while (low <= high) {
                mid = (low + high) / 2;
                if (list.get(mid) < timestamp && timestamp < list.get(mid + 1)) {
                    return record.get(key).get(list.get(mid));
                } else if (list.get(mid) < timestamp) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return "";
        }
    }

}
