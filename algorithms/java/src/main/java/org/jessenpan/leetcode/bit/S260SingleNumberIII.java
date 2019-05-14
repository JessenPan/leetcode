package org.jessenpan.leetcode.bit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:bit
 */
public class S260SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        List<Integer> singleNums = new ArrayList<>();
        int len = nums.length;
        int num = nums[0];
        for (int i = 1; i < len; i++) {
            num = (num ^ nums[i]);
            if (num == nums[i]) {
                singleNums.add(num);
            }
        }
        return singleNums.stream().mapToInt(t -> t).toArray();
    }

}
