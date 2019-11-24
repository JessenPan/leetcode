package org.jessenpan.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 * tag:sort
 */
public class S912SortAnArray {

    public List<Integer> sortArray(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }
}
