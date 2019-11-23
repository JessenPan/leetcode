package org.jessenpan.leetcode.sample;

import org.jessenpan.leetcode.sample.S398RandomPickIndex.Solution;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S398RandomPickIndexTest {

    @Test
    public void test1() {
        Solution randomPickIndex = new Solution(new int[] { 1, 2, 3, 3, 3 });
        System.out.println(randomPickIndex.pick(3));
        System.out.println(randomPickIndex.pick(1));
        System.out.println(randomPickIndex.pick(3));
        System.out.println(randomPickIndex.pick(3));
        System.out.println(randomPickIndex.pick(3));
    }

}
