package org.jessenpan.leetcode;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S232ImplementQueueUsingStacks {

    static class MyQueue {

        private Stack<Integer> pushStack = new Stack<>();

        private Stack<Integer> popStack = new Stack<>();

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            pushStack.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (!popStack.isEmpty()) {
                return popStack.pop();
            }
            changeStack();
            return popStack.pop();
        }

        private void changeStack() {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (!popStack.isEmpty()) {
                return popStack.peek();
            }
            changeStack();
            return popStack.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return pushStack.isEmpty() && popStack.isEmpty();
        }
    }
}
