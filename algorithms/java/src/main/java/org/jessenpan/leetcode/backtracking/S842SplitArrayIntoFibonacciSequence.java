package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S842SplitArrayIntoFibonacciSequence {

    private List<Integer> fibonacci = new ArrayList<>();

    public List<Integer> splitIntoFibonacci(String s) {

        int len = s.length();
        if (len < 3) {
            return Collections.emptyList();
        }
        boolean canFound = false;
        for (int firstEnd = 1; firstEnd < len - 1; firstEnd++) {

            if (canFound) {
                break;
            }
            if (s.charAt(0) == '0' && firstEnd > 1) {
                break;
            }
            for (int secondEnd = firstEnd + 1; secondEnd < len; secondEnd++) {

                if (s.charAt(firstEnd) == '0' && secondEnd - firstEnd > 1) {
                    break;
                }
                fibonacci.clear();
                String firstVal = s.substring(0, firstEnd);
                String secondVal = s.substring(firstEnd, secondEnd);
                String leaved = s.substring(secondEnd);
                try {
                    fibonacci.add(Integer.parseInt(firstVal));
                    fibonacci.add(Integer.parseInt(secondVal));
                } catch (NumberFormatException e) {
                    break;
                }
                if (canBeFibonacci(firstVal, secondVal, leaved)) {
                    canFound = true;
                    break;
                }
            }
        }

        return canFound ? fibonacci : Collections.emptyList();
    }

    private boolean canBeFibonacci(String first, String second, String leaved) {
        if ("".equals(leaved)) {
            return false;
        }

        Integer iSecond = Integer.parseInt(first) + Integer.parseInt(second);
        if (iSecond < 0) {
            return false;
        }
        String addedThree = String.valueOf(iSecond);
        if (addedThree.length() > leaved.length()) {
            return false;
        }
        String strSplitWithCalThree = leaved.substring(0, addedThree.length());
        if (addedThree.equals(strSplitWithCalThree)) {
            fibonacci.add(iSecond);
            String nextLeaved = leaved.substring(addedThree.length());
            if ("".equals(nextLeaved)) {
                return true;
            }
            return canBeFibonacci(second, addedThree, nextLeaved);
        } else {
            return false;
        }

    }
}
