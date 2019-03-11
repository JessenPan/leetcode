package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:array
 */
public class S905SortArrayByParity {

    public int[] sortArrayByParity(int[] a) {
        int[] sortedByParityArray = new int[a.length];
        int lengthOfOriginArray = a.length;
        int theLeadIndex = 0, theLastIndex = lengthOfOriginArray - 1;
        for (int elementOfA : a) {
            if (elementOfA % 2 == 0) {
                sortedByParityArray[theLeadIndex++] = elementOfA;
            } else {
                sortedByParityArray[theLastIndex--] = elementOfA;
            }
        }
        return sortedByParityArray;
    }

}
