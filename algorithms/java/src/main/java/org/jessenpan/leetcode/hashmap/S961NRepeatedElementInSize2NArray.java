package org.jessenpan.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S961NRepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] a) {
        int lengthOfA = a.length;
        int nTimes = lengthOfA / 2;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < lengthOfA; i++) {
            Integer singleCounter = counter.get(a[i]);
            singleCounter = singleCounter == null ? 1 : ++singleCounter;
            if (singleCounter == nTimes) {
                return a[i];
            }
            counter.put(a[i], singleCounter);
        }
        throw new IllegalArgumentException("the size of array must be 2*n!");
    }
}
