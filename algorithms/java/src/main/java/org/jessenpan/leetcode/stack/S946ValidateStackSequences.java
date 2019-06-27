package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S946ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int lenOfPushed = pushed.length;
        Stack<Integer> stack = new Stack<>();
        int idxOfPop = 0;
        for (int i = 0; i < lenOfPushed; i++) {

            if (pushed[i] == popped[idxOfPop]) {
                idxOfPop++;
                while (!stack.isEmpty() && stack.peek().equals(popped[idxOfPop])) {
                    stack.pop();
                    idxOfPop++;
                }
            } else {
                stack.push(pushed[i]);
            }
        }

        return stack.isEmpty();
    }

}
