package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S504Base7 {

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean isMinus = num < 0;
        if (isMinus) {
            num = -num;
        }
        StringBuilder sb = new StringBuilder();
        int remainder;
        while (num != 0) {
            remainder = num % 7;
            num = num / 7;
            sb.append(remainder);
        }
        return (isMinus ? "-" : "") + sb.reverse().toString();
    }

}
