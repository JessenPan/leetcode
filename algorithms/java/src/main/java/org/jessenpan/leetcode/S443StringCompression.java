package org.jessenpan.leetcode;

import java.util.Stack;

/**
 * @author jessenpan
 */
public class S443StringCompression {

    public int compress(char[] chars) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 0, length = chars.length;
        for (int i = 0; i < length; i++) {
            if (stack.isEmpty()) {
                stack.push(chars[i]);
                count++;
            } else if (chars[i] == stack.peek()) {
                count++;
                if (i == (length - 1)) {
                    sb.append(count);
                }
            } else {
                if (count != 1) {
                    sb.append(count);
                }
                count = 1;
                stack.push(chars[i]);
            }
        }

        return stack.size() + sb.length();
    }

}
