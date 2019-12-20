package org.jessenpan.leetcode.map;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author jessenpan
 * tag:map
 */
public class S846HandOfStraights {

    public boolean isNStraightHand(int[] hands, int w) {
        int len = hands.length;
        if (len == 0 || len % w != 0) {
            return false;
        }

        SortedMap<Integer, Integer> record = new TreeMap<>();
        for (int hand : hands) {
            int times = record.getOrDefault(hand, 0);
            record.put(hand, times + 1);
        }
        while (!record.isEmpty()) {

            Set<Integer> keys = record.keySet();
            Integer lastKey = null;
            int i = 0;
            Set<Integer> removedKeys = new HashSet<>();
            for (Integer key : keys) {
                if (i >= w) {
                    break;
                }
                if (lastKey == null) {
                    lastKey = key;
                } else {
                    if (key - lastKey != 1) {
                        return false;
                    }
                    lastKey = key;
                }
                removedKeys.add(key);
                i++;
            }
            if (i < w) {
                return false;
            }
            for (Integer removedKey : removedKeys) {

                Integer times = record.get(removedKey);
                if (times == 1) {
                    record.remove(removedKey);
                } else {
                    record.put(removedKey, times - 1);
                }
            }
        }
        return true;
    }

}
