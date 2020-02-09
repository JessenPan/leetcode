package org.jessenpan.leetcode.recursion;

/**
 * @author jessenpan
 * tag:recursion
 */
public class S779KThSymbolInGrammar {

    public int kthGrammar(int row, int num) {
        if (row == 1 || num == 1) {
            return 0;
        }

        return find(0, row, num);
    }

    private int find(int element, int row, int num) {

        if (row == 1) {
            return element;
        }

        int sum = (int) Math.pow(2, row - 1);
        if (num > sum / 2) {
            //right
            return find(element == 0 ? 1 : 0, row - 1, num - sum / 2);
        } else {
            //left
            return find(element == 0 ? 0 : 1, row - 1, num);
        }
    }

}
