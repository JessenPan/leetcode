package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:math
 * //TODO study algorithms
 */
public class S367ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long left = 0, right = num, halfNum = (left + right) / 2;
        while ((left < right) && halfNum != left && halfNum != right) {
            if (halfNum * halfNum == num) {
                return true;
            } else if (halfNum * halfNum > num) {
                right = halfNum;
                halfNum = (left + right) / 2;
            } else {
                left = halfNum;
                halfNum = (left + right) / 2;
            }
        }
        return false;
    }
}
