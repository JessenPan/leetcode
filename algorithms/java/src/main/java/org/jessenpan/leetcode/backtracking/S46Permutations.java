package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S46Permutations {

    private int length;

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        length = nums.length;
        findPermutation(permutations, 0, nums);
        return permutations;
    }

    private void findPermutation(List<List<Integer>> permutations, int index, int[] nums) {

        if (index == nums.length) {
            List<Integer> per = new ArrayList<>();
            Arrays.stream(nums).forEach(per::add);
            permutations.add(per);
            return;
        }
        for (int i = index; i < length; i++) {
            swap(nums, index, i);
            findPermutation(permutations, index + 1, nums);
            swap(nums, index, i);
        }
    }

    private void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

}
