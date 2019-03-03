package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * @since 2019/3/3 21:41
 */
public class Solution503 {

    public int[] nextGreaterElements(int[] nums) {

        int[] result = new int[nums.length];
        int lengthOfNums = nums.length;
        for (int i = 0; i < lengthOfNums; i++) {
            Stack<Integer> decreasedStack = buildDecreasedStack(i, nums);
            if (decreasedStack.isEmpty()) {
                result[i] = -1;
                continue;
            }
            boolean hasFoundGreaterVal = false;
            while (!decreasedStack.isEmpty()) {
                Integer poppedVal = decreasedStack.pop();
                if (poppedVal > nums[i]) {
                    result[i] = poppedVal;
                    hasFoundGreaterVal = true;
                    break;
                }
            }
            if (!hasFoundGreaterVal) {
                result[i] = -1;
            }
        }

        return result;
    }

    private Stack<Integer> buildDecreasedStack(int i, int[] nums) {

        Stack<Integer> decreasedStack = new Stack<>();
        int lengthOfNums = nums.length;
        for (int j = 1; j < lengthOfNums; j++) {
            int x = nums[(i + lengthOfNums - j) % lengthOfNums];
            if (decreasedStack.isEmpty()) {
                decreasedStack.push(x);
            } else {
                if (decreasedStack.peek() > x) {
                    decreasedStack.push(x);
                } else {
                    while (!decreasedStack.isEmpty() && decreasedStack.peek() < x) {
                        decreasedStack.pop();
                    }
                    decreasedStack.push(x);

                }
            }
        }
        return decreasedStack;
    }
}
