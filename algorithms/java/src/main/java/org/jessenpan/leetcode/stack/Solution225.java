package org.jessenpan.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author jessenpan
 * @since 2019/2/28 23:46
 */
public class Solution225 {

    public static class MyStack {

        private Queue<Integer> queue = new ArrayDeque<>();

        private Queue<Integer> popQueue = new ArrayDeque<>();

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            queue.offer(x);
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            if (popQueue.isEmpty()) {
                transferQueue();
            }
            return popQueue.poll();
        }

        private void transferQueue() {
            if (queue.size() == 1) {
                popQueue.offer(queue.poll());
                return;
            }
            int loopSize = queue.size() - 1;
            while (loopSize > 0) {
                queue.offer(queue.poll());
                loopSize--;
            }
            popQueue.offer(queue.poll());
        }

        /**
         * Get the top element.
         */
        public int top() {
            if (popQueue.size() == 1) {
                return popQueue.peek();
            }
            int loopSize = queue.size() - 1;
            while (loopSize > 0) {
                queue.offer(queue.poll());
                loopSize--;
            }
            int result = queue.poll();
            queue.offer(result);
            return result;
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return queue.isEmpty() && popQueue.isEmpty();
        }
    }

}
