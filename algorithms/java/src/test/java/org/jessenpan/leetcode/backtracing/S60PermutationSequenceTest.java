package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S60PermutationSequence;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S60PermutationSequenceTest {

    private S60PermutationSequence permutationSequence = new S60PermutationSequence();

    @Test
    public void test1() {
        String permutation = permutationSequence.getPermutation(3, 3);
        Assert.assertEquals("213", permutation);
    }

    @Test
    public void test2() {
        String permutation = permutationSequence.getPermutation(4, 9);
        Assert.assertEquals("2314", permutation);
    }

    @Test
    public void test3() {
        String permutation = permutationSequence.getPermutation(3, 5);
        Assert.assertEquals("312", permutation);
    }

    @Test
    public void test4() {
        String permutation = permutationSequence.getPermutation(9, 233794);
        Assert.assertEquals("312", permutation);
    }

}
