package org.jessenpan.leetcode.dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jessenpan
 * tag:dfs
 */
public class S473MatchSticksToSquare {

    public List<Integer> nums;
    public int[] sums=new int[4];
    public int possibleSquareSide;


    public boolean dfs(int index) {

        if (index == this.nums.size()) {
            return sums[0] == sums[1] && sums[1] == sums[2] && sums[2] == sums[3];
        }

        int element = this.nums.get(index);

        for(int i = 0; i < 4; i++) {
            if (this.sums[i] + element <= this.possibleSquareSide) {
                this.sums[i] += element;
                if (this.dfs(index + 1)) {
                    return true;
                }
                this.sums[i] -= element;
            }
        }

        return false;
    }

    public boolean makesquare(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int L = nums.length;
        int perimeter = 0;
        for(int i = 0; i < L; i++) {
            perimeter += nums[i];
        }

        this.possibleSquareSide =  perimeter / 4;
        if (this.possibleSquareSide * 4 != perimeter) {
            return false;
        }

        this.nums = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(this.nums, Collections.reverseOrder());
        return this.dfs(0);
    }

}
