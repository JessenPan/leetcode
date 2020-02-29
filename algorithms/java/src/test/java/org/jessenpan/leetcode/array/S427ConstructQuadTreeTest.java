package org.jessenpan.leetcode.array;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S427ConstructQuadTreeTest {

    private S427ConstructQuadTree constructQuadTree = new S427ConstructQuadTree();

    @Test
    public void test1() {
        S427ConstructQuadTree.Node root = constructQuadTree.construct(new int[][] { { 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 0, 0, 0 } });
        System.out.println(root);
    }

}
