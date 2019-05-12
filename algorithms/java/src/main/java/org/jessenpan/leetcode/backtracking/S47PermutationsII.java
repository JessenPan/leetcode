package org.jessenpan.leetcode.backtracking;

import java.util.*;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S47PermutationsII {

    private List<List<Integer>> permutations = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        doPermutation(nums, 0);
        return permutations;
    }

    private Set<String> record = new HashSet<>();

    private void doPermutation(int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> per = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            Arrays.stream(nums).forEach(n -> {
                per.add(n);
                sb.append(n);
            });
            String str = sb.toString();
            if (!record.contains(str)) {
                permutations.add(per);
                record.add(str);
            }
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            doPermutation(nums, index + 1);
            swap(nums, i, index);
        }
    }

    private void swap(int[] nums, int index, int index1) {
        int tmp = nums[index];
        nums[index] = nums[index1];
        nums[index1] = tmp;
    }

}
