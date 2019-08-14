package org.jessenpan.leetcode.greedy;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S316RemoveDuplicateLetters {

    //TODO 
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (stack.contains(ch)) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > ch && s.lastIndexOf(stack.peek()) > i) {
                stack.pop();
            }
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);
        return sb.toString();
    }

}
