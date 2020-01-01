package org.jessenpan.leetcode.array;

import org.jessenpan.leetcode.random.S528RandomPickWithWeight.Solution;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S528RandomPickWithWeightTest {

    @Test
    public void test1() {
        Solution randomPickWithWeight = new Solution(new int[] { 1, 3 });
        System.out.println(randomPickWithWeight.pickIndex());
        System.out.println(randomPickWithWeight.pickIndex());
        System.out.println(randomPickWithWeight.pickIndex());
        System.out.println(randomPickWithWeight.pickIndex());
        System.out.println(randomPickWithWeight.pickIndex());
    }

}
