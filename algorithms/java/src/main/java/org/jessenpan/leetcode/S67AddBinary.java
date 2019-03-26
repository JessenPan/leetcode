package org.jessenpan.leetcode;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:string
 */
public class S67AddBinary {

    public String addBinary(String a, String b) {
        Stack<Integer> stackOfA = convertToStack(a);
        Stack<Integer> stackOfB = convertToStack(b);
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int sum = 0;
        while (!stackOfA.isEmpty() || !stackOfB.isEmpty()||carry!=0) {
            if (!stackOfA.isEmpty()) {
                sum += stackOfA.pop();
            }
            if (!stackOfB.isEmpty()) {
                sum += stackOfB.pop();
            }
            sum+=carry;
            if(sum>=2){
                carry=1;
                sb.append(sum-2);
            }else{
                sb.append(sum);
                carry=0;
            }
            sum=0;
        }
        return sb.reverse().toString();
    }

    private Stack<Integer> convertToStack(String str) {
        Stack<Integer> stack = new Stack<>();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            stack.push(str.charAt(i) - '1' + 1);
        }
        return stack;
    }
}
