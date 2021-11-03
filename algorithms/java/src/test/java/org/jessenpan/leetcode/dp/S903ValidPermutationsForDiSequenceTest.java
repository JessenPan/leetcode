package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S903ValidPermutationsForDiSequenceTest {

    private S903ValidPermutationsForDiSequence validPermutationsForDiSequence = new S903ValidPermutationsForDiSequence();

    @Test
    public void test1() {
        int t = validPermutationsForDiSequence.numPermsDISequence("DID");
        Assert.assertEquals(5, t);
    }

}
