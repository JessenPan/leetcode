package org.jessenpan.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S914XOfAKindInADeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        int groupSize = -1;
        Map<Integer, Integer> record = new HashMap<>();
        for (int value : deck) {
            Integer count = record.get(value);
            count = (count == null ? 1 : count + 1);
            record.put(value, count);
        }
        for (Integer size : record.values()) {
            if (groupSize == -1) {
                groupSize = size;
            } else if (size < groupSize) {
                groupSize = size;
            }
        }
        if (groupSize < 2) {
            return false;
        }
        boolean isFound = true;
        for (int i = 2; i <= groupSize; i++) {
            for (Integer size : record.values()) {
                if (size % i != 0) {
                    isFound = false;
                    break;
                }
            }
            if (isFound) {
                return true;
            }
            isFound=true;
        }
        return false;
    }
}
