package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S1021RemoveOutermostParentheses {


    private static final char RIGHT_BRACKET = ')';

    public String removeOuterParentheses(String s) {
        if (s.isEmpty()) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        int lastIdx = 0;
        for (int i = 0; i < len; i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                lastIdx = i;
                continue;
            }

            if (RIGHT_BRACKET == s.charAt(i)) {
                stack.pop();
                if (stack.isEmpty()) {
                    sb.append(s.substring(lastIdx + 1, i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        return sb.toString();
    }

}
