package org.jessenpan.leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S385MiniParser {

    public static class NestedInteger {

        private int v;

        private List<NestedInteger> list = new ArrayList<>();

        public NestedInteger() {}

        public NestedInteger(int value) {
            this.v = value;
        }

        public boolean isInteger() {
            return list.isEmpty();
        }

        public Integer getInteger() {return v;}

        public void setInteger(int value) {
            this.v = value;
        }

        public void add(NestedInteger ni) {
            list.add(ni);
        }

        public List<NestedInteger> getList() {
            return list;
        }

    }

    //TODO 
    public NestedInteger deserialize(String s) {
        if (s.isEmpty()) {
            return null;
        }
        if (!s.contains("[")) {
            return new NestedInteger(Integer.parseInt(s));
        }
        int len = s.length(), i = 0, lastIdx = 0;
        Stack<Object> stack = new Stack<>();
        while (i < len) {

            if (s.charAt(i) == '[') {
                stack.push("[");
                lastIdx = i + 1;
            }
            if (s.charAt(i) == ']' || s.charAt(i) == ',') {
                String str = s.substring(lastIdx, i);
                stack.push(str);
                lastIdx = i + 1;
            }
            if (s.charAt(i) == ']') {
                parse(stack);
            }

            i++;
        }
        return (NestedInteger) stack.get(0);
    }

    private void parse(Stack<Object> stack) {

        List<NestedInteger> list = new ArrayList<>();
        Integer v = null;
        while (true) {
            Object o = stack.pop();
            if (o instanceof NestedInteger) {
                list.add((NestedInteger) o);
            } else {
                String str = (String) o;
                if ("[".equals(str)) {
                    break;
                } else if (!str.isEmpty()) {
                    v = Integer.parseInt(str);
                }
            }
        }
        NestedInteger ni = (v != null) ? new NestedInteger(v) : new NestedInteger();
        for (NestedInteger nestedInteger : list) {
            ni.add(nestedInteger);
        }
        stack.push(ni);
    }
}
