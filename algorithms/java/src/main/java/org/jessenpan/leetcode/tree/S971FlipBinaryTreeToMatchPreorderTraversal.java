package org.jessenpan.leetcode.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jessenpan
 * tag:tree
 */
public class S971FlipBinaryTreeToMatchPreorderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }

        TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }

    private List<Integer> flipVoyages = new ArrayList<>();

    private boolean isCanFlip = true;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        findFlipVoyages(root, voyage, 0, voyage.length - 1);
        return flipVoyages;
    }

    private void findFlipVoyages(TreeNode node, int[] voyage, int left, int right) {
        if (node == null || !isCanFlip || left > right) {
            return;
        }
        if (node.val != voyage[left]) {
            flipVoyages.clear();
            flipVoyages.add(-1);
            isCanFlip = false;
            return;
        }

        Set<Integer> lefts = new HashSet<>();
        calTree(node.left, lefts);

        Set<Integer> rights = new HashSet<>();
        calTree(node.right, rights);

        Set<Integer> leftArray = calArray(voyage, left + 1, lefts.size(), right);
        Set<Integer> rightArray = calArray(voyage, left + 1 + lefts.size(), rights.size(), right);

        if (lefts.equals(leftArray) && rights.equals(rightArray)) {

            findFlipVoyages(node.left, voyage, left + 1, left + lefts.size());
            findFlipVoyages(node.right, voyage, left + 1 + lefts.size(), right);
            return;
        }

        rightArray = calArray(voyage, left + 1 + rights.size(), lefts.size(), right);
        leftArray = calArray(voyage, left + 1, rights.size(), right);
        if (lefts.equals(rightArray) && rights.equals(leftArray)) {
            flipVoyages.add(node.val);

            findFlipVoyages(node.left, voyage, left + 1 + rights.size(), right);
            findFlipVoyages(node.right, voyage, left + 1, left + rights.size());
            return;
        }
        flipVoyages.clear();
        flipVoyages.add(-1);
        isCanFlip = false;
    }

    private Set<Integer> calArray(int[] voyage, int start, int size, int end) {
        Set<Integer> list = new HashSet<>();
        end = Math.min(start + size, end + 1);
        for (int i = start; i < end; i++) {
            list.add(voyage[i]);
        }
        return list;
    }

    private void calTree(TreeNode node, Set<Integer> list) {
        if (node != null) {
            list.add(node.val);
            calTree(node.left, list);
            calTree(node.right, list);
        }
    }

}
