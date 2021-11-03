package org.jessenpan.leetcode.dfs;

import java.util.*;

/**
 * @author jessenpan
 * tag:dfs
 */
public class S301RemoveInvalidParentheses {

    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        if (s.equals("()") || s.equals("")) {
            result.add(s);
            return result;
        }

        Deque<String> queue = new ArrayDeque<>();
        queue.offer(s);
        HashSet<String> set = new HashSet<>();  //用于存储裁剪后的元素，防止重复元素加入队列
        boolean isFound = false;    //判断是否找到了有效字符串

        while (!queue.isEmpty()) {  //队列不为空
            String curr = queue.poll();
            if (isValid(curr)) {
                result.add(curr);
                isFound = true;
            }
            if (isFound) {  //找到后不再进行裁剪
                continue;
            }
            //裁剪过程
            for (int i = 0; i < curr.length(); i++) {
                if (curr.charAt(i) == '(' || curr.charAt(i) == ')') {   //只对'('或')'进行裁剪
                    String str;
                    if (i == curr.length()-1) {
                        str = curr.substring(0, curr.length()-1);
                    } else {
                        str = curr.substring(0, i) + curr.substring(i+1);
                    }
                    if (set.add(str)) { //如果集合中还未有该字符串
                        queue.offer(str);
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add("");
        }
        return result;
    }

    private static boolean isValid(String s) {
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i);
            if (curr == '(') {
                left++;
            } else if (curr == ')') {
                if (left != 0) {
                    left--;
                } else {
                    return false;
                }
            }
        }
        return left == 0;
    }

}
