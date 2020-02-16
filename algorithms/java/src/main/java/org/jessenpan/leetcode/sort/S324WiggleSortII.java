package org.jessenpan.leetcode.sort;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:sort
 */
public class S324WiggleSortII {

    public void wiggleSort(int[] nums) {

        int len = nums.length;
        int[] copied = Arrays.copyOf(nums, len);
        Arrays.sort(copied);
        int halfLen = len / 2, leftIdx = 0, rightIdx = len - 1, j = 0;
        if ((len & 1) == 0) {
            //偶数
            leftIdx = halfLen - 1;
        } else {
            leftIdx = halfLen;
        }
        int cnt = 0;
        while (cnt < halfLen) {
            nums[j] = copied[leftIdx];
            j++;
            nums[j] = copied[rightIdx];
            j++;
            leftIdx--;
            rightIdx--;
            cnt++;
        }
        if ((len & 1) == 1) {
            nums[j] = copied[0];
        }
    }

}
