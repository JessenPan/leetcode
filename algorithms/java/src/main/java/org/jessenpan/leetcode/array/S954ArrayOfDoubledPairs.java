package org.jessenpan.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S954ArrayOfDoubledPairs {

    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> record = new HashMap<>();
        for (int x : arr) {
            record.put(x, record.getOrDefault(x, 0) + 1);
        }

        Integer[] bArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            bArr[i] = arr[i];
        }

        Arrays.sort(bArr, Comparator.comparingInt(Math::abs));

        for (int x : bArr) {
            // If this can't be consumed, skip
            if (record.get(x) == 0) {
                continue;
            }
            if (record.getOrDefault(2 * x, 0) <= 0) {
                return false;
            }

            // Write x, 2*x
            record.put(x, record.get(x) - 1);
            record.put(2 * x, record.get(2 * x) - 1);
        }

        return true;
    }

}
