package org.jessenpan.leetcode.stack;

import org.jessenpan.leetcode.S496NextGreaterElementI;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S496NextGreaterElementITest {

    private S496NextGreaterElementI s496NextGreaterElementI = new S496NextGreaterElementI();

    @Test
    public void test1() {
        int[] result = s496NextGreaterElementI.nextGreaterElement(new int[] { 4, 1, 2 }, new int[] { 1, 3, 4, 2 });
        assertArrayEquals(new int[] { -1, 3, -1 }, result);
    }

    @Test
    public void test2() {
        int[] result = s496NextGreaterElementI.nextGreaterElement(new int[] { 2, 4 }, new int[] { 1, 2, 3, 4 });
        assertArrayEquals(new int[] { 3, -1 }, result);
    }

}
