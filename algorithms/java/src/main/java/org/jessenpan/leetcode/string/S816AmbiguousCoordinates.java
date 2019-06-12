package org.jessenpan.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 * tag:string
 */
public class S816AmbiguousCoordinates {

    public List<String> ambiguousCoordinates(String s) {
        if (s == null || s.isEmpty()) {
            return Collections.emptyList();
        }
        s = s.substring(1, s.length() - 1);
        List<String> list = new ArrayList<>();
        int len = s.length();
        for (int i = 1; i < len; i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            List<String> leftNums = parseNum(left);
            List<String> rightNums = parseNum(right);
            for (String leftNum : leftNums) {
                for (String rightNum : rightNums) {
                    list.add("(" + leftNum + ", " + rightNum + ")");
                }
            }
        }
        return list;
    }

    private List<String> parseNum(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.emptyList();
        }
        if (str.length() == 1) {
            return Collections.singletonList(str);
        }
        if (Integer.parseInt(str) == 0) {
            return Collections.emptyList();
        }
        List<String> nums = new ArrayList<>();
        if (String.valueOf(Integer.parseInt(str)).equals(str)) {
            nums.add(str);
        }

        int len = str.length();
        if (str.charAt(len - 1) == '0') {
            return nums;
        }
        for (int i = 0; i <= len - 2; i++) {
            if (i == 0) {
                nums.add(str.substring(0, 1) + "." + str.substring(1));
                continue;
            }
            String s = str.substring(0, i + 1);
            if (s.charAt(0) == '0' || Integer.parseInt(s) == 0) {
                break;
            }
            nums.add(s + "." + str.substring(i + 1));
        }
        return nums;
    }
}
