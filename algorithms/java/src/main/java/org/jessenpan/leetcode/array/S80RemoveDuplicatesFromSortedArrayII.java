package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S80RemoveDuplicatesFromSortedArrayII {

    //TODO study
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }
        int len = nums.length;
        int current = 1;           
        //从第三位开始循环，前两位无论如何都是要加入新数组的
        for (int i = 2; i < len; i++) {
            //符合条件，加入新数组
            if (nums[i] != nums[current - 1]) {
                current += 1;
                nums[current] = nums[i];
            }
        }
        return current + 1;
    }

}
