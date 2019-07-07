package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S1031MaximumSumOfTwoNonOverLappingSubarrays {

    public int maxSumTwoNoOverlap(int[] array, int L, int M) {
        return Math.max(maxSum(array, L, M), maxSum(array, M, L));
    }

    private int maxSum(int[] array, int m, int l) {
        int max = 0;
        int arrayLen = array.length, leftLen = arrayLen - m + 1, rightLen = arrayLen - l + 1;

        int lastLeftMax = -1;
        for (int i = 0; i < leftLen; i++) {
            int leftSum = count(array, i, m);
            if (leftSum <= lastLeftMax) {
                continue; //剪枝
            }
            for (int j = i + m; j < rightLen; j++) {
                int rightSum = count(array, j, l);
                max = Math.max(leftSum + rightSum, max);
            }
        }
        return max;
    }

    private int count(int[] array, int i, int m) {
        int len = i + m;
        int sum = 0;
        for (; i < len; i++) {
            sum += array[i];
        }
        return sum;
    }

}
