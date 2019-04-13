package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S605CanPlaceFlowersTest {

    private S605CanPlaceFlowers canPlaceFlowers = new S605CanPlaceFlowers();

    @Test
    public void test1() {
        boolean isCanPlace = canPlaceFlowers.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1);
        assertTrue(isCanPlace);
    }

    @Test
    public void test2() {
        boolean isCanPlace = canPlaceFlowers.canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2);
        assertFalse(isCanPlace);
    }

    @Test
    public void test3() {
        boolean isCanPlace = canPlaceFlowers.canPlaceFlowers(new int[] { 1 }, 0);
        assertTrue(isCanPlace);
    }

}
