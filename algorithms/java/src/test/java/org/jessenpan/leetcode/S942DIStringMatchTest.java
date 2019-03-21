package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 * tag:math
 */
public class S942DIStringMatchTest {

    private S942DIStringMatch diStringMatch = new S942DIStringMatch();

    @Test
    public void test1() {
        int[] diArray = diStringMatch.diStringMatch("DIDI");
        assertArrayEquals(new int[] { 4, 0, 3, 1, 2 }, diArray);
    }

}
