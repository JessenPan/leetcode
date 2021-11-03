package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S65ValidNumber {

    public boolean isNumber(String s) {

        return s.matches("\\s*[+-]?([\\d]+(\\.[\\d]*)?|\\.[\\d]+)(e[+-]?[\\d]+)? *$");
    }

}
