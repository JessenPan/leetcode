package org.jessenpan.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jessenpan
 * tag:tree
 */
public class S1104PathInZigzagLabelledBinaryTree {

    public List<Integer> pathInZigZagTree(int label) {
        int sum = 0, level = 0;
        while (sum < label) {
            level++;
            sum += Math.pow(2, level - 1);
        }
        List<Integer> paths = new LinkedList<>();
        for (int i = level; i >= 1; i--) {
            paths.add(0, label);
            if ((i & 1) == 0) {
                label = (int) (Math.pow(2, i - 1) + Math.pow(2, i) - 1 - label);
                label = label / 2;
            } else {
                label = label / 2;
                label = (int) (Math.pow(2, i - 2) + Math.pow(2, i - 1) - 1 - label);
            }
        }
        return paths;
    }
}

 
