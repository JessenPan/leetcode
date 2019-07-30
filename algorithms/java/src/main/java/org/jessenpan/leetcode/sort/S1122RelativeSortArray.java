package org.jessenpan.leetcode.sort;

import java.util.*;

/**
 * @author jessenpan
 * tag:array
 */
public class S1122RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> record = new HashMap<>();
        int len = arr2.length;
        for (int i = 0; i < len; i++) {
            record.put(arr2[i], i);
        }

        Map<Integer, List<Integer>> maps = new HashMap<>();

        for (int e1 : arr1) {
            Integer idx = record.get(e1);
            if (idx == null) {
                idx = len;
            }
            List<Integer> list = maps.getOrDefault(idx, new ArrayList<>());
            list.add(e1);
            maps.put(idx, list);
        }

        List<Integer> sortArray = new ArrayList<>();
        for (int i = 0; i < len + 1; i++) {
            List<Integer> list = maps.get(i);
            if (list == null || list.isEmpty()) {
                continue;
            }
            if (i == len) {
                Collections.sort(list);
            }
            sortArray.addAll(list);
        }
        return sortArray.stream().mapToInt(t -> t).toArray();
    }

}
