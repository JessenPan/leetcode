package org.jessenpan.leetcode;

import org.jessenpan.leetcode.S331VerifyPreOrderSerializationOfABinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 * @date 2019-03-04 15:03
 */
public class S331_VerifyPreOrderSerializationOfABinaryTreeTest {

    private S331VerifyPreOrderSerializationOfABinaryTree verifyPreOrderSerializationOfABinaryTree = new S331VerifyPreOrderSerializationOfABinaryTree();

    @Test
    public void test1() {
        boolean verifiedResult = verifyPreOrderSerializationOfABinaryTree.isValidSerialization("1,#");
        assertFalse(verifiedResult);
    }

    @Test
    public void test2() {
        boolean verifiedResult = verifyPreOrderSerializationOfABinaryTree.isValidSerialization("9,#,#,1");
        assertFalse(verifiedResult);
    }

    @Test
    public void test3() {
        boolean verifiedResult = verifyPreOrderSerializationOfABinaryTree.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#");
        assertTrue(verifiedResult);
    }

    @Test
    public void test4() {
        boolean verifiedResult = verifyPreOrderSerializationOfABinaryTree.isValidSerialization("1,#,#,#,#");
        assertFalse(verifiedResult);
    }

    @Test
    public void test5() {
        boolean verifiedResult = verifyPreOrderSerializationOfABinaryTree.isValidSerialization("#,7,6,9,#,#,#");
        assertFalse(verifiedResult);
    }

    @Test
    public void test6() {
        boolean verifiedResult = verifyPreOrderSerializationOfABinaryTree.isValidSerialization("7,2,#,2,#,#,#,6,#");
        assertFalse(verifiedResult);
    }

}
