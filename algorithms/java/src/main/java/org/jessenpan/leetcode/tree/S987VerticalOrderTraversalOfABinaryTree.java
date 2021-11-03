package org.jessenpan.leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 * tag:tree
 */
public class S987VerticalOrderTraversalOfABinaryTree {


    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }
    
    List<Location> locations;

   

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        locations = new ArrayList<>();
        dfs(root, 0, 0);
        Collections.sort(locations);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());

        int prev = locations.get(0).x;

        for (Location loc : locations) {
            if (loc.x != prev) {
                prev = loc.x;
                ans.add(new ArrayList<Integer>());
            }

            // We always add the node's value to the latest report.
            ans.get(ans.size() - 1).add(loc.val);
        }

        return ans;
    }

    public void dfs(TreeNode node, int x, int y) {
        if (node != null) {
            locations.add(new Location(x, y, node.val));
            dfs(node.left, x - 1, y + 1);
            dfs(node.right, x + 1, y + 1);
        }
    }

    static class Location implements Comparable<Location> {

        int x, y, val;

        Location(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Location that) {
            if (this.x != that.x)
                return Integer.compare(this.x, that.x);
            else if (this.y != that.y)
                return Integer.compare(this.y, that.y);
            else
                return Integer.compare(this.val, that.val);
        }
    }

}

