package org.jessenpan.leetcode;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S155MinStack {

    public static class MinStack {

        private Stack<Integer> stack = new Stack<>();

        private Stack<Integer> sortedStack = new Stack<>();

        /**
         * initialize your data structure here.
         */
        public MinStack() {
        }

        public void push(int x) {
            stack.push(x);
            if (sortedStack.isEmpty() || x <= sortedStack.peek()) {
                sortedStack.push(x);
            }
        }

        public void pop() {
            int poppedVal = stack.pop();
            if (sortedStack.peek().equals(poppedVal)) {
                sortedStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return sortedStack.peek();
        }
    }

}
