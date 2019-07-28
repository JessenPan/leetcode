package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S1017ConvertToBase2 {

    //TODO 
    public String baseNeg2(int n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (n != 0) {
            if (n % 2 == 0) {
                result.insert(0, '0');
                n = n / (-2);
            } else {
                result.insert(0, '1');
                n = (n - 1) / (-2);
            }
        }

        return result.toString();
    }

}
