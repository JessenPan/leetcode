package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S22GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();
        findParenthesis(n, n, "", parenthesis);
        return parenthesis;
    }

    private void findParenthesis(int leftBracket, int rightBracket, String subParenthesis, List<String> parenthesis) {
        if (leftBracket == 0 && rightBracket == 0) {
            parenthesis.add(subParenthesis);
            return;
        }

        if (leftBracket < rightBracket) {
            if (rightBracket - 1 >= 0) {
                findParenthesis(leftBracket, rightBracket - 1, subParenthesis + ")", parenthesis);
            }
            if (leftBracket - 1 >= 0) {
                findParenthesis(leftBracket - 1, rightBracket, subParenthesis + "(", parenthesis);
            }
        } else {
            if (leftBracket - 1 >= 0) {
                findParenthesis(leftBracket - 1, rightBracket, subParenthesis + "(", parenthesis);
            }
        }
    }

}
