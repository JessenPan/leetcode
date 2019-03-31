package org.jessenpan.leetcode.breadthfirstsearch;

import java.util.*;

/**
 * @author jessenpan
 * tag:tree
 */
public class S107BinaryTreeLevelOrderTraversalII {

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        Stack<List<Integer>> multiLeveledStack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        multiLeveledStack.add(Collections.singletonList(root.val));
        while (!queue.isEmpty()) {
            List<Integer> theLevelList = new LinkedList<>();
            List<TreeNode> theNextNode = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode theFather = queue.poll();
                if (theFather.left != null) {
                    theNextNode.add(theFather.left);
                    theLevelList.add(theFather.left.val);
                }
                if (theFather.right != null) {
                    theNextNode.add(theFather.right);
                    theLevelList.add(theFather.right.val);
                }
            }
            if (theLevelList.size() > 0) {
                multiLeveledStack.push(theLevelList);
            }
            if (theNextNode.size() > 0) {
                theNextNode.forEach(queue::offer);
            }
        }
        return convertStack2List(multiLeveledStack);
    }

    private List<List<Integer>> convertStack2List(Stack<List<Integer>> multiLeveledStack) {
        List<List<Integer>> lists = new LinkedList<>();
        while(!multiLeveledStack.isEmpty()){
            lists.add(multiLeveledStack.pop());
        }
        return lists;
    }
}
