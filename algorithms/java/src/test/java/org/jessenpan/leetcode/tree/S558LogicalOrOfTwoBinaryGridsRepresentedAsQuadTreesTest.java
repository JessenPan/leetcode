package org.jessenpan.leetcode.tree;

import org.junit.Test;

import static org.jessenpan.leetcode.tree.S558LogicalOrOfTwoBinaryGridsRepresentedAsQuadTrees.*;

/**
 * @author jessenpan
 * @date 2020/3/6 上午11:51
 */
public class S558LogicalOrOfTwoBinaryGridsRepresentedAsQuadTreesTest {

    private S558LogicalOrOfTwoBinaryGridsRepresentedAsQuadTrees logicalOrOfTwoBinaryGridsRepresentedAsQuadTrees = new S558LogicalOrOfTwoBinaryGridsRepresentedAsQuadTrees();
    
    @Test
    public void test1(){
        Node left = new Node(true, false, new Node(true, true), new Node(true, true), new Node(false, true), new Node(false, true));
        Node right=new Node(true,false,
                new Node(true,true),
                new Node(true,false,new Node(false,true),new Node(false,true),new Node(true,true),new Node(true,true)),
                new Node(true,true),
                new Node(false,true)
        );
       Node node= logicalOrOfTwoBinaryGridsRepresentedAsQuadTrees.intersect(left, right);
       System.out.println(node);
    }

    @Test
    public void test2(){
        Node left = new Node(true, false, new Node(true, true), new Node(false, true), new Node(true, true), new Node(true, true));
        Node right=new Node(true,false,
                new Node(true,true),
                new Node(true,false,new Node(true,true),new Node(false,true),new Node(false,true),new Node(true,true)),
                new Node(true,true),
                new Node(true,true)
        );
        Node node= logicalOrOfTwoBinaryGridsRepresentedAsQuadTrees.intersect(left, right);
        System.out.println(node);
    }

}
