package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S507PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 1;
        int end = (int) Math.ceil(Math.sqrt(num));
        for (int i = 2; i < end; i++) {
            if (num % i == 0) {
                sum += i + num / i;
            }
        }
        return sum == num;
    }
}
