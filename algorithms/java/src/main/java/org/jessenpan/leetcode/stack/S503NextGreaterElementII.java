package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S503NextGreaterElementII {

    public int[] nextGreaterElements(int[] nums) {

        int[] result = new int[nums.length];
        int lengthOfNums = nums.length;
        Stack<Integer> decreasedStack = new Stack<>();
        int[] doubleSizeNums = new int[2 * lengthOfNums];
        System.arraycopy(nums, 0, doubleSizeNums, 0, lengthOfNums);
        System.arraycopy(nums, 0, doubleSizeNums, lengthOfNums, lengthOfNums);
        int doubleLengthOfNums = 2 * lengthOfNums;
        for (int i = 0; i < doubleLengthOfNums; i++) {
            int currentIndex = doubleLengthOfNums - i - 1;
            if (decreasedStack.isEmpty()) {
                if (i >= lengthOfNums) {
                    result[currentIndex] = -1;
                }
                decreasedStack.push(doubleSizeNums[currentIndex]);
                continue;
            }

            int leastMaxElement = findLeastMaxElement(decreasedStack, doubleSizeNums, currentIndex);
            if (i >= lengthOfNums) {
                result[currentIndex] = leastMaxElement;
            }
        }

        return result;
    }

    private int findLeastMaxElement(Stack<Integer> decreasedStack, int[] doubleSizeNums, int currentIndex) {
        if (decreasedStack.isEmpty()) {
            decreasedStack.push(doubleSizeNums[currentIndex]);
            return -1;
        }
        if (decreasedStack.peek() > doubleSizeNums[currentIndex]) {
            int leastMaxElement = decreasedStack.peek();
            decreasedStack.push(doubleSizeNums[currentIndex]);
            return leastMaxElement;
        } else {
            decreasedStack.pop();
            return findLeastMaxElement(decreasedStack, doubleSizeNums, currentIndex);
        }
    }

}
