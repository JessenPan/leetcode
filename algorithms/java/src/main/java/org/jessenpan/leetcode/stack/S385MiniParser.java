package org.jessenpan.leetcode.stack;

import java.util.List;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S385MiniParser {

    public static class NestedInteger {

        public NestedInteger() {}

        public NestedInteger(int value) {}

        public boolean isInteger() {return false;}

        public Integer getInteger() {return 1;}

        public void setInteger(int value) {}

        public void add(NestedInteger ni) {}

        public List<NestedInteger> getList() {return null;}

    }

    public NestedInteger deserialize(String s) {
        if (!s.contains("[")) {
            return new NestedInteger(Integer.valueOf(s));
        }
        String[] splitArray = s.replace("[", "").replace("]", "").split(",");
        NestedInteger resultNestedInteger = null;
        Stack<NestedInteger> nestedIntegerStack = new Stack<>();
        int lengthOfArray = splitArray.length;
        for (int i = 0; i < lengthOfArray; i++) {
            NestedInteger tmp;
            if ("".equals(splitArray[i])) {
                tmp = new NestedInteger();
            } else {
                tmp = new NestedInteger(Integer.valueOf(splitArray[i]));
            }
            if (i == 0) {
                resultNestedInteger = tmp;
            }
            if (nestedIntegerStack.isEmpty()) {
                nestedIntegerStack.push(tmp);
            } else {
                nestedIntegerStack.peek().add(tmp);
                nestedIntegerStack.push(tmp);
            }
        }
        return resultNestedInteger;
    }
}
