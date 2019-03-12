package org.jessenpan.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author jessenpan
 */
public class S20ValidParentheses {

    private static final Set<String> SYMBOLS = new HashSet<>();

    static {
        SYMBOLS.add("()");
        SYMBOLS.add("[]");
        SYMBOLS.add("{}");
    }

    public boolean isValid(String s) {

        if (s == null || s.length() == 0) {
            return true;
        }
        int lengthOfStr = s.length();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < lengthOfStr; i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i) + "");
                continue;
            }
            String topElement = stack.peek();
            if (topElement != null) {
                String combinedStr = topElement + s.charAt(i);
                if (SYMBOLS.contains(combinedStr)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i) + "");
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
