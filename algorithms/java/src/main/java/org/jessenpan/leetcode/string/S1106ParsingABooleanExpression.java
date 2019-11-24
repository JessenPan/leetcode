package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S1106ParsingABooleanExpression {

    public boolean parseBoolExpr(String expression) {
        if (expression.equals("t") || expression.equals("f")) {
            return expression.equals("t");
        }

        if (expression.startsWith("!")) {
            return !parseBoolExpr(expression.substring(2, expression.length() - 1));
        }

        String[] subExprs = expression.substring(2, expression.length() - 1).split(",");

        boolean v = parseBoolExpr(subExprs[0]);
        int len = subExprs.length;
        for (int i = 1; i < len; i++) {
            if (expression.startsWith("&")) {
                v = v & parseBoolExpr(subExprs[i]);
            } else {
                v = v | parseBoolExpr(subExprs[i]);
            }
        }
        return v;

    }
}
