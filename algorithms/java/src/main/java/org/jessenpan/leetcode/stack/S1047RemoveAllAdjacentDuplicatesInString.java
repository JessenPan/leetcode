package org.jessenpan.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author jessenpan
 * tag:stack
 */
public class S1047RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        if (s.isEmpty()) {
            return s;
        }

        Deque<Character> deque = new ArrayDeque<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (deque.isEmpty()) {
                deque.push(s.charAt(i));
                continue;
            }

            if (deque.peek().equals(s.charAt(i))) {
                deque.pop();
            } else {
                deque.push(s.charAt(i));
            }
        }

        if (deque.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.pollLast());
        }
        return sb.toString();
    }

}
