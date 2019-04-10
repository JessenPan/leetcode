package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S350IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] shortArray = nums1.length <= nums2.length ? nums1 : nums2;
        int[] longArray = nums1.length > nums2.length ? nums1 : nums2;
        Map<Integer, Integer> record = recordNum(shortArray);
        List<Integer> list = new ArrayList<>();
        for (int element : longArray) {
            Integer count = record.get(element);
            if (count != null && count > 0) {
                list.add(element);
                record.put(element, --count);
            }
        }
        return list.stream().mapToInt(t -> t).toArray();
    }

    private Map<Integer, Integer> recordNum(int[] shortArray) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : shortArray) {
            Integer count = map.get(element);
            map.put(element, count == null ? 1 : ++count);
        }
        return map;
    }

}
