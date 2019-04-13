package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S507PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i < num / i; i++) {
            if (num % i == 0) {
                sum += i + num / i;
            }
        }
        return num != 1 && sum == num;
    }
}
