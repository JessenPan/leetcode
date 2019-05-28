package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S10RegularExpressionMatching;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S10RegularExpressionMatchingTest {

    private S10RegularExpressionMatching regularExpressionMatching = new S10RegularExpressionMatching();

    @Test
    public void test1() {
        boolean isMatch = regularExpressionMatching.isMatch("aa", "a");
        Assert.assertFalse(isMatch);
    }

}
