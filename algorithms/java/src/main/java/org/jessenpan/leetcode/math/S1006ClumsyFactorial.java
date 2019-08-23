package org.jessenpan.leetcode.math;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author jessenpan
 * tag:math
 */
public class S1006ClumsyFactorial {

    public int clumsy(int n) {

        Deque<Integer> deque = new ArrayDeque<>();
        String op = "*";
        deque.push(n);
        for (int i = n - 1; i > 0; i--) {
            switch (op) {
                case "*":
                    deque.push(deque.pop() * i);
                    op = "/";
                    break;
                case "/":
                    deque.push(Math.floorDiv(deque.pop(), i));
                    op = "+";
                    break;
                case "+":
                    deque.push(i);
                    op = "-";
                    break;
                case "-":
                    deque.push(i);
                    op = "*";
                    break;
            }
        }
        int val = deque.pollLast();
        op = "+";
        while (!deque.isEmpty()) {
            if ("+".equals(op)) {
                val += deque.pollLast();
                op = "-";
            } else if ("-".equals(op)) {
                val -= deque.pollLast();
                op = "+";
            }
        }
        return val;
    }

}
