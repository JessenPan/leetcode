package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S47PermutationsII;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S47PermutationsIITest {

    private S47PermutationsII permutationsII = new S47PermutationsII();
    
    @Test
    public void test1(){
        permutationsII.permuteUnique(new int[] { 1, 1, 2 });
    }
}
