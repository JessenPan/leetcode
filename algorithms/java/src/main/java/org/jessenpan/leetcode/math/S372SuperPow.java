package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S372SuperPow {

    //TODO study
    public int superPow(int a, int[] b) {
        a = a%1337;
        int result = Fun(a, b, b.length);
        return result;
    }

    int Fun(int a, int[] b, int len) {
        int res = 1;
        if (len > 1) {
            int pre = Fun(a, b, len-1);
            for (int i = 0; i < 10; i ++) {
                res = res * pre;
                res = res%1337;
            }
        }

        int rest = 1;
        int count = b[len-1];
        for (int i = 0; i < count; i ++) {
            rest = rest * a;
            rest = rest%1337;
        }
        res = res * rest;

        res = res%1337;
        return res;
    }
}
