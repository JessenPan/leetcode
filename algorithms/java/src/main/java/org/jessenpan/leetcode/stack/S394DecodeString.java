package org.jessenpan.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author jessenpan
 * tag:stack
 */
public class S394DecodeString {

    public String decodeString(String s) {
        if (s == null || "".equals(s) || !s.contains("[")) {
            return s;
        }

        Deque<String> stack = new LinkedList<>();
        int len = s.length(), lastIdx = 0;
        for (int i = 0; i < len; i++) {

            if (i == 0) {
                continue;
            }

            if (Character.isDigit(s.charAt(i)) && Character.isAlphabetic(s.charAt(i - 1))) {
                stack.push(s.substring(lastIdx, i));
                lastIdx = i;
                continue;
            }
            if (s.charAt(i) == '[') {
                stack.push(s.substring(lastIdx, i));
                lastIdx = i + 1;
                continue;
            }
            if (s.charAt(i) == ']') {
                String sub = s.substring(lastIdx, i);
                if (!sub.isEmpty()) {
                    stack.push(sub);
                }
                stack.push(parse(stack));
                lastIdx = i + 1;
                continue;
            }
            if (i == (len - 1) && Character.isAlphabetic(s.charAt(i))) {
                stack.push(s.substring(lastIdx, i + 1));
            }
        }

        String rst = parse(stack);
        while (!stack.isEmpty()) {
            stack.push(rst);
            rst = parse(stack);
        }
        return rst;
    }

    private String parse(Deque<String> stack) {

        String str = "";
        String sNum = null;
        while (!stack.isEmpty()) {
            String tmp = stack.pop();
            if (Character.isDigit(tmp.charAt(0))) {
                sNum = tmp;
                break;
            } else {
                str = tmp + str;
            }
        }
        if (sNum == null) {
            return str;
        }
        int num = Integer.parseInt(sNum);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

}
