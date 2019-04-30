package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S78Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        findSubsets(0, subsets, nums, new ArrayList<>());
        return subsets;
    }

    private void findSubsets(int index, List<List<Integer>> subsets, int[] nums, List<Integer> partSubset) {
        if (index == nums.length) {
            subsets.add(partSubset);
        } else {
            findSubsets(index + 1, subsets, nums, new ArrayList<>(partSubset));
            List<Integer> newPartSubset = new ArrayList<>(partSubset);
            newPartSubset.add(nums[index]);
            findSubsets(index + 1, subsets, nums, newPartSubset);
        }
    }
}
