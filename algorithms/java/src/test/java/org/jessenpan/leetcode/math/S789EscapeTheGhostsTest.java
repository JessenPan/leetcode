package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S789EscapeTheGhostsTest {

    private S789EscapeTheGhosts escapeTheGhosts = new S789EscapeTheGhosts();

    @Test
    public void test1() {
        boolean canEscape = escapeTheGhosts.escapeGhosts(new int[][] { { 1, 0 }, { 0, 3 } }, new int[] { 0, 1 });
        Assert.assertTrue(canEscape);
    }

    @Test
    public void test2() {
        boolean canEscape = escapeTheGhosts.escapeGhosts(new int[][] { { 1, 0 } }, new int[] { 2, 0 });
        Assert.assertFalse(canEscape);
    }

    @Test
    public void test3() {
        boolean canEscape = escapeTheGhosts.escapeGhosts(new int[][] { { 2, 0 } }, new int[] { 1, 0 });
        Assert.assertFalse(canEscape);
    }

}
