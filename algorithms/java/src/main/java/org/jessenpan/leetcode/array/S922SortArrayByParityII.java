package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S922SortArrayByParityII {

    public int[] sortArrayByParityII(int[] a) {
        int[] result = new int[a.length];
        int parityIndex = 0, oddIndex = 1;
        int lengthOfA = a.length;
        for (int i = 0; i < lengthOfA; i++) {
            if (a[i] % 2 == 0) {
                result[parityIndex] = a[i];
                parityIndex = 2 + parityIndex;
            } else {
                result[oddIndex] = a[i];
                oddIndex = 2 + oddIndex;
            }
        }
        return result;
    }
}
 
