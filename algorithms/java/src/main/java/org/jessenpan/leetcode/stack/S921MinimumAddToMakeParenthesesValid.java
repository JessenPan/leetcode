package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S921MinimumAddToMakeParenthesesValid {

    private static final String BRACKET = "()";

    public int minAddToMakeValid(String s) {

        Stack<Character> leavedStack = new Stack<>();

        int lengthOfS = s.length();

        for (int i = 0; i < lengthOfS; i++) {
            char elementOfS = s.charAt(i);
            if (leavedStack.isEmpty()) {
                leavedStack.push(elementOfS);
            } else {
                char elementInStack = leavedStack.peek();
                if (isBracket(elementInStack, elementOfS)) {
                    leavedStack.pop();
                } else {
                    leavedStack.push(elementOfS);
                }
            }
        }

        return leavedStack.size();
    }

    private boolean isBracket(char left, char right) {
        return BRACKET.equals(String.valueOf(left) + right);
    }

}
