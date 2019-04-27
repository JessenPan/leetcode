package org.jessenpan.leetcode.string;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:string
 */
public class S696CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        int count = 0, index, leftSize, rightSize;
        int length = s.length(), i = 0;
        Stack<Character> charStack = new Stack<>();
        boolean hasMatch;
        while (i < length) {
            charStack.clear();
            charStack.push(s.charAt(i));
            index = i + 1;
            hasMatch = false;
            leftSize = 1;
            rightSize = 0;
            while (!charStack.isEmpty() && index < length) {
                if (charStack.peek().equals(s.charAt(index))) {
                    if (hasMatch) {
                        break;
                    }
                    charStack.push(s.charAt(index));
                    leftSize++;
                } else {
                    charStack.pop();
                    rightSize++;
                    hasMatch = true;
                }
                index++;
            }
            count += Math.min(leftSize, rightSize);
            i += leftSize;
        }
        return count;
    }
}
    
