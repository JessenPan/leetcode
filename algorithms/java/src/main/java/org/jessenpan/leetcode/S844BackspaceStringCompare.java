package org.jessenpan.leetcode;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S844BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stackOfS = convert(s);
        Stack<Character> stackOfT = convert(t);

        StringBuilder sAfterCal = new StringBuilder(), tAfterCal = new StringBuilder();
        stackOfS.forEach(sAfterCal::append);
        stackOfT.forEach(tAfterCal::append);
        return sAfterCal.toString().equals(tAfterCal.toString());
    }

    public Stack<Character> convert(String s) {
        if (s == null || s.length() == 0) {
            return new Stack<>();
        }

        Stack<Character> stack = new Stack<>();
        int lengthOfS = s.length();
        for (int i = 0; i < lengthOfS; i++) {
            char charOfS = s.charAt(i);
            if (charOfS == '#' && !stack.isEmpty()) {
                stack.pop();
            } else if (charOfS != '#') {
                stack.push(charOfS);
            }
        }
        return stack;
    }

    /**
     * @author jessenpan
     * tag:array
     */
    public static class S867TransposeMatrix {
    
        public int[][] transpose(int[][] A) {
            int lengthOfFirstLevel = A.length, lengthOfSecondLevel = A[0].length;
            int[][] transposedArray = new int[lengthOfSecondLevel][lengthOfFirstLevel];
    
            for (int i = 0; i < lengthOfSecondLevel; i++) {
                for (int j = 0; j < lengthOfFirstLevel; j++) {
                    transposedArray[i][j] = A[j][i];
                }
            }
            return transposedArray;
        }
    }
}
