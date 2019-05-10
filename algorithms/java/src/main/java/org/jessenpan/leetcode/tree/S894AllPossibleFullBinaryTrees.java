package org.jessenpan.leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 * tag:tree
 */
public class S894AllPossibleFullBinaryTrees {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public List<TreeNode> allPossibleFBT(int n) {
        if ((n & 1) == 0) {
            return Collections.emptyList();
        }
        return findAllPossibleFBT(n);
    }

    private List<TreeNode> findAllPossibleFBT(int n) {
        if (n == 1) {
            return Collections.singletonList(new TreeNode(0));
        }
        List<TreeNode> treeNodes = new ArrayList<>();
        for (int i = 1; i < (n - 1); i = i + 2) {
            List<TreeNode> lefts = findAllPossibleFBT(i);
            List<TreeNode> rights = findAllPossibleFBT(n - i - 1);

            for (int j = 0; j < lefts.size(); j++) {
                for (int k = 0; k < rights.size(); k++) {
                    TreeNode treeNode = new TreeNode(0);
                    treeNode.left = lefts.get(j);
                    treeNode.right = rights.get(k);
                    treeNodes.add(treeNode);
                }
            }
        }
        return treeNodes;
    }

}
