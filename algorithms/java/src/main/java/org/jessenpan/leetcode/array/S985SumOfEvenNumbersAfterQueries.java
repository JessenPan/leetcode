package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S985SumOfEvenNumbersAfterQueries {

    public int[] sumEvenAfterQueries(int[] array, int[][] queries) {
        int length = array.length;
        int[] answers = new int[length];
        int val, index;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            val = queries[i][0];
            index = queries[i][1];
            array[index] = array[index] + val;
            for (int num : array) {
                if ((num & 1) != 1) {
                    sum += num;
                }
            }
            answers[i] = sum;
            sum = 0;
        }
        return answers;
    }
    

}
