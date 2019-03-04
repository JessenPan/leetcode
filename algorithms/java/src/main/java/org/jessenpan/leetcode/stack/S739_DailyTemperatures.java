package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 */
public class S739_DailyTemperatures {

    public int[] dailyTemperatures(int[] t) {

        Stack<Integer> decreasedStack = new Stack<>();

        int lengthOfArray = t.length;
        int[] result = new int[lengthOfArray];
        for (int i = lengthOfArray - 1; i >= 0; i--) {
            if (decreasedStack.isEmpty()) {
                result[i] = 0;
                decreasedStack.push(i);//push the position
            } else {
                buildDecreasedStack(t, decreasedStack, result, i);
            }
        }
        return result;
    }

    private int[] convert2IntArray(Stack<Integer> result) {
        if (result == null || result.isEmpty()) {
            return new int[0];
        }
        int lengthOfArray = result.size();
        int[] intArray = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            intArray[i] = result.pop();
        }
        return intArray;
    }

    private void buildDecreasedStack(int[] t, Stack<Integer> decreasedStack, int[] result, int i) {
        if (decreasedStack.isEmpty()) {
            decreasedStack.push(i);
            result[i] = 0;
            return;
        }
        if (t[decreasedStack.peek()] > t[i]) {
            result[i] = (Math.abs(i - decreasedStack.peek()));
            decreasedStack.push(i);
        } else {
            decreasedStack.pop();
            buildDecreasedStack(t, decreasedStack, result, i);
        }
    }

}
