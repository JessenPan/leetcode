package org.jessenpan.leetcode.string;

import java.util.*;

/**
 * @author jessenpan
 * tag:string
 */
public class S227BasicCalculatorII {

    private static final char PLUS = '+';

    private static final char MINUS = '-';

    private static final char MULTI = '*';

    private static final char DIVISION = '/';

    private static final Set<Character> SYMBOLS = new HashSet<Character>();

    static {
        SYMBOLS.add(PLUS);
        SYMBOLS.add(MINUS);
        SYMBOLS.add(MULTI);
        SYMBOLS.add(DIVISION);
    }

    public int calculate(String s) {

        List<String> list = new ArrayList<>();
        int len = s.length();
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (SYMBOLS.contains(s.charAt(i))) {
                list.add(sb.toString());
                list.add(String.valueOf(s.charAt(i)));
                sb = new StringBuilder();
            } else if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            }
            if (i == (len - 1)) {
                list.add(sb.toString());
            }
        }
        len = list.size();
        Deque<String> stack = new ArrayDeque<>();
        int idx = 0;
        while (idx < len) {
            String str = list.get(idx);
            if (str.length() == 1 && (str.charAt(0) == DIVISION || str.charAt(0) == MULTI)) {
                int val = 0;
                if (str.charAt(0) == DIVISION) {
                    val = Integer.parseInt(stack.pop()) / Integer.parseInt(list.get(idx + 1));
                } else {
                    val = Integer.parseInt(stack.pop()) * Integer.parseInt(list.get(idx + 1));
                }
                idx += 2;
                stack.push(String.valueOf(val));
            } else {
                stack.push(str);
                idx++;
            }
        }
        while (!stack.isEmpty()) {
            String str = stack.pollLast();
            if (str.length() == 1 && (str.charAt(0) == MINUS || str.charAt(0) == PLUS)) {
                if (str.charAt(0) == MINUS) {
                    sum = sum - Integer.parseInt(stack.pollLast());
                } else {
                    sum = sum + Integer.parseInt(stack.pollLast());
                }
            } else {
                sum = Integer.parseInt(str);
            }
        }
        return sum;
    }
    
}
