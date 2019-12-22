package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S390EliminationGame {

    //TODO 数学规律
    public int lastRemaining(int n) {
        if (n == 2)
            return 2;
        if (n == 1)
            return 1;
        if (n % 2 == 1) {
            return lastRemaining(n - 1);
        } else {
            return 2 * (n / 2 + 1 - lastRemaining(n / 2));
        }
    }
}
