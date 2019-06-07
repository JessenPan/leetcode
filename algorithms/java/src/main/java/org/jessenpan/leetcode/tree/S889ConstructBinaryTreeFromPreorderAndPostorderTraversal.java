package org.jessenpan.leetcode.tree;

/**
 * @author jessenpan
 * tag:tree
 */
public class S889ConstructBinaryTreeFromPreorderAndPostorderTraversal {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return buildTree(pre, 0, pre.length - 1, post, 0, post.length - 1);
    }

    private TreeNode buildTree(int[] pre, int preLeft, int preRight, int[] post, int postLeft, int postRight) {
        if (preLeft > preRight) {
            return null;
        }

        TreeNode node = new TreeNode(pre[preLeft]);

        int preMid = -1, postMid = -1;
        int indexOfPre = preLeft + 1, indexOfPost = postLeft;
        int preSum = 0, postSum = 0;
        while (indexOfPre <= preRight && indexOfPost <= (postRight - 1)) {
            preSum += pre[indexOfPre];
            postSum += post[indexOfPost];
            if (preSum == postSum) {
                preMid = indexOfPre;
                postMid = indexOfPost;
                break;
            }
            indexOfPre++;
            indexOfPost++;
        }
        if (preMid != -1) {
            node.left = buildTree(pre, preLeft + 1, preMid, post, postLeft, postMid);
            node.right = buildTree(pre, preMid + 1, preRight, post, postMid + 1, postRight - 1);
        }

        return node;
    }

}
