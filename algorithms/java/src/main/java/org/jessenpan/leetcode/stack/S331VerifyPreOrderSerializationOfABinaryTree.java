package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S331VerifyPreOrderSerializationOfABinaryTree {

    private static final String WELL_NO = "#";

    public boolean isValidSerialization(String preorder) {
        Stack<String> countStack = new Stack<>();
        int lengthOfPreOrder = preorder.length();
        int lastCommaIndex = 0;
        for (int i = 0; i < lengthOfPreOrder; i++) {
            String operationVal;
            if (preorder.charAt(i) == ',' || i == (lengthOfPreOrder - 1)) {
                if (i == (lengthOfPreOrder - 1)) {
                    operationVal = preorder.substring(lastCommaIndex);
                } else {
                    operationVal = preorder.substring(lastCommaIndex, i);
                }
                lastCommaIndex = i + 1;
                if (WELL_NO.equals(operationVal)) {
                    if (countStack.isEmpty() && i != (lengthOfPreOrder - 1)) {
                        return false;
                    } else if (countStack.isEmpty() || WELL_NO.equals(countStack.peek())) {
                        countStack.push(operationVal);
                    } else {
                        countStack.pop();
                    }
                } else {
                    countStack.push(operationVal);
                }
            }
        }
        return !countStack.isEmpty() && countStack.size() == 1 && "#".equals(countStack.peek());
    }
}
