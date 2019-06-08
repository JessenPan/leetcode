package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S1028RecoverATreeFromPreorderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    private static final char SYMBOL = '-';

    public TreeNode recoverFromPreorder(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        int idxOfFirstSymbol = s.indexOf(SYMBOL);
        int nodeVal;
        if (idxOfFirstSymbol == -1) {
            nodeVal = Integer.parseInt(s);
        } else {
            nodeVal = Integer.parseInt(s.substring(0, idxOfFirstSymbol));
        }
        TreeNode node = new TreeNode(nodeVal);
        if (idxOfFirstSymbol == -1) {
            return node;
        }

        int sum = 0;
        while (s.charAt(idxOfFirstSymbol) == SYMBOL) {
            sum++;
            idxOfFirstSymbol++;
        }

        int idxOfFirst = indexOfSum(s, sum);
        int idxOfLast = lastIndexOfSum(s, sum);

        if (idxOfFirst == idxOfLast) {
            node.left = recoverFromPreorder(s.substring(idxOfFirst + sum));
        } else {
            node.left = recoverFromPreorder(s.substring(idxOfFirst + sum, idxOfLast));
            node.right = recoverFromPreorder(s.substring(idxOfLast + sum));
        }
        return node;
    }

    private int lastIndexOfSum(String s, int sum) {
        int tmpSum = 0, len = s.length() - 1;
        for (int i = len; i >= 0; i--) {
            if (s.charAt(i) == SYMBOL) {
                tmpSum++;
            } else {
                if (tmpSum == sum) {
                    return i + 1;
                }
                tmpSum = 0;
            }
        }
        return -1;
    }

    private int indexOfSum(String s, int sum) {
        int tmpSum = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == SYMBOL) {
                tmpSum++;
            } else {
                if (tmpSum == sum) {
                    return i - sum;
                }
                tmpSum = 0;
            }
        }
        return -1;
    }

}
