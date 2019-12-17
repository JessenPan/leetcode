package org.jessenpan.leetcode.doublepointer;

/**
 * @author jessenpan
 * tag:doublepointer
 */
public class S1004MaxConsecutiveOnesIII {

    public int longestOnes(int[] a, int k) {

        int len = a.length;
        int left = 0, right = 0;
        int max = 0, numOfZero = (a[0] == 0 ? 1 : 0);
        while (right < len) {

            if (numOfZero <= k) {
                max = Math.max(max, right - left + 1);
                right++;
                if (right < len && a[right] == 0) {
                    numOfZero++;
                }
            } else {
                left++;
                if (a[left - 1] == 0) {
                    numOfZero--;
                }
            }
        }
        return max;
    }

}
