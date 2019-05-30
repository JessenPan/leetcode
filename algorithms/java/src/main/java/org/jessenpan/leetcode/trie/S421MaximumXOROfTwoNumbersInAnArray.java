package org.jessenpan.leetcode.trie;

/**
 * @author jessenpan
 * tag:trie
 */
public class S421MaximumXOROfTwoNumbersInAnArray {

    static class Node {

        boolean isEnd;
        Node[] children = new Node[2];
    }

    private Node root = new Node();

    private void insert(int x) {
        Node p = root;
        for (int i = 31; i >= 0; --i) {
            int bit = (x >> i) & 1;
            if (p.children[bit] == null) {
                p.children[bit] = new Node();
            }
            p = p.children[bit];
        }
        p.isEnd = true;
    }

    private int searchMaxXOR(int x) {
        Node p = root;
        int ans = 0;
        for (int i = 31; i >= 0; --i) {
            int bit = (x >> i) & 1;
            if (p.children[bit ^ 1] != null) {
                p = p.children[bit ^ 1];
                ans = ans | (1 << i);
            } else {
                p = p.children[bit];
            }
        }
        return ans;
    }

    public int findMaximumXOR(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return 0;
        }
        this.insert(nums[0]);
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, this.searchMaxXOR(nums[i]));
            this.insert(nums[i]);
        }
        return ans;
    }
}
