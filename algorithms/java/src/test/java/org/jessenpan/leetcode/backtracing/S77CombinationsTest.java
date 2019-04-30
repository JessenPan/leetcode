package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S77Combinations;
import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S77CombinationsTest {

    private S77Combinations combinations = new S77Combinations();
    
    @Test
    public void test1(){
        List<List<Integer>> combinationAns = combinations.combine(4, 2);
        System.out.println(combinationAns);
    }
    
}
