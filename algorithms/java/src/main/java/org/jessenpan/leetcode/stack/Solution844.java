package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * @since 2019/2/25 23:16
 */
public class Solution844 {

    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stackOfS = convert(s);
        Stack<Character> stackOfT = convert(t);

        StringBuilder sAfterCal = new StringBuilder(), tAfterCal = new StringBuilder();
        stackOfS.forEach(sAfterCal::append);
        stackOfT.forEach(tAfterCal::append);
        return sAfterCal.toString().equals(tAfterCal.toString());
    }

    public Stack<Character> convert(String s) {
        if (s == null || s.length() == 0) {
            return new Stack<>();
        }

        Stack<Character> stack = new Stack<>();
        int lengthOfS = s.length();
        for (int i = 0; i < lengthOfS; i++) {
            char charOfS = s.charAt(i);
            if (charOfS == '#' && !stack.isEmpty()) {
                stack.pop();
            } else if (charOfS != '#') {
                stack.push(charOfS);
            }
        }
        return stack;
    }
}
