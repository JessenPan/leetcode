package org.jessenpan.leetcode.binarysearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jessenpan
 * tag:binarysearch
 */
public class S658FindKClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = Arrays.stream(arr).boxed().sorted((a, b) -> a.equals(b) ? a - b : Math.abs(a-x) - Math.abs(b-x)).collect(Collectors.toList());
        list = list.subList(0, k);
        Collections.sort(list);
        return list;
    }

}
