package org.jessenpan.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:stack
 */
public class S1190ReverseSubstringsBetweenEachPairOfParentheses {

    public String reverseParentheses(String s) {

        Deque<Character> deque = new LinkedList<>();
        Queue<Character> reverseQueue = new LinkedList<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {

            if (s.charAt(i) == ')') {
                //doReverse
                char c;
                while (true) {
                    c = deque.pop();
                    if (c == '(') {
                        break;
                    }
                    reverseQueue.offer(c);
                }
                while (!reverseQueue.isEmpty()) {
                    deque.push(reverseQueue.poll());
                }
                continue;
            }
            deque.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.pollLast());
        }
        return sb.toString();
    }

}
