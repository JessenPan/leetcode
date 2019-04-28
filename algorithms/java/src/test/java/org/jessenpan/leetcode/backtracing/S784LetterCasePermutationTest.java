package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S784LetterCasePermutation;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S784LetterCasePermutationTest {

    private S784LetterCasePermutation letterCasePermutation = new S784LetterCasePermutation();

    @Test
    public void test1() {
        List<String> permutation = letterCasePermutation.letterCasePermutation("a1b2");
        Assert.assertEquals(Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2"), permutation);
    }

    @Test
    public void test2() {
        List<String> permutation = letterCasePermutation.letterCasePermutation("C");
        Assert.assertEquals(Arrays.asList("c","C"), permutation);
    }

}
