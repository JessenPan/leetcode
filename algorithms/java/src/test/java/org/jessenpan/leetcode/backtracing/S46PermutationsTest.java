package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S46Permutations;
import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S46PermutationsTest {

    private S46Permutations permutations = new S46Permutations();
    
    @Test
    public void test1(){
        List<List<Integer>> permutationList = permutations.permute(new int[] { 1, 2, 3 });
        System.out.println(permutationList);
    }
    
}
