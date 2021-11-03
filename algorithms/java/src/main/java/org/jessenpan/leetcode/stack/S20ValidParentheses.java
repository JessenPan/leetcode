package org.jessenpan.leetcode.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S20ValidParentheses {

    private static final Set<Character> RIGHT_SYMBOLS = new HashSet<>();

    private static final Set<String> BRACES = new HashSet<>();

    static {
        RIGHT_SYMBOLS.add(')');
        RIGHT_SYMBOLS.add(']');
        RIGHT_SYMBOLS.add('}');

        BRACES.add("()");
        BRACES.add("[]");
        BRACES.add("{}");
    }

    public boolean isValid(String s) {

        if (s == null || s.length() == 0) {
            return true;
        }
        int lengthOfStr = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < lengthOfStr; i++) {
            Character c = s.charAt(i);
            if (!RIGHT_SYMBOLS.contains(c)) {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
            Character topChar = stack.peek();

            String brace = topChar + "" + c;
            if (BRACES.contains(brace)) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
