package org.jessenpan.leetcode.string;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:string
 */
public class S971ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (isLetter(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
        }
        for (int i = 0; i < length; i++) {
            if (isLetter(s.charAt(i))) {
                sb.append(stack.pop());
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    private boolean isLetter(char aChar) {
        return (aChar >= 'a' && aChar <= 'z') || (aChar >= 'A' && aChar <= 'Z');
    }
}
