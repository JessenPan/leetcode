package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S633SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        int right = (int) Math.sqrt(c);
        int left = 0;
        int sum;
        while (left <= right) {
            sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
