package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S1200MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            min = Math.min(min, arr[i + 1] - arr[i]);
        }

        List<List<Integer>> rs = new ArrayList<>();
        for (int i = 0; i < len - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                rs.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return rs;
    }

}
