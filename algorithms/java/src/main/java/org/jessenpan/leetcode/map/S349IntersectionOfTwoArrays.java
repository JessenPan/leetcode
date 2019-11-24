package org.jessenpan.leetcode.map;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S349IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (int elementOfNums1 : nums1) {
            set1.add(elementOfNums1);
        }
        Set<Integer> intersectionSet = new HashSet<>();
        for (int elementOfNums2 : nums2) {
            if (set1.contains(elementOfNums2)) {
                intersectionSet.add(elementOfNums2);
            }
        }

        return intersectionSet.stream().mapToInt(t -> t).toArray();
    }
}
