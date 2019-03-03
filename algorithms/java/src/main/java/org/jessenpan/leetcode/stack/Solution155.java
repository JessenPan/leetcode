package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * @since 2019/3/1 0:19
 */
public class Solution155 {

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
