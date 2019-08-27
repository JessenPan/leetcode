package org.jessenpan.leetcode.divideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag: divideAndConquer
 */
public class S241DifferentWaysToAddParentheses {

    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        if (!input.contains("+") && !input.contains("-") && !input.contains("*")) {
            result.add(Integer.valueOf(input));
            return result;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                List<Integer> leftRsts = diffWaysToCompute(input.substring(0, i));
                List<Integer> rightRsts = diffWaysToCompute(input.substring(i + 1));
                for (Integer left : leftRsts) {
                    for (Integer right : rightRsts) {
                        if (input.charAt(i) == '+') {
                            result.add(left + right);
                        } else if (input.charAt(i) == '-') {
                            result.add(left - right);
                        } else if (input.charAt(i) == '*') {
                            result.add(left * right);
                        }
                    }
                }
            }
        }
        return result;
    }

}
