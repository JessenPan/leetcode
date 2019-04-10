package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S219ContainsDuplicateIITest {

    private S219ContainsDuplicateII containsDuplicateII = new S219ContainsDuplicateII();

    @Test
    public void test1() {
        boolean isContains = containsDuplicateII.containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3);
        assertTrue(isContains);
    }

    @Test
    public void test2() {
        boolean isContains = containsDuplicateII.containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1);
        assertTrue(isContains);
    }

    @Test
    public void test3() {
        boolean isContains = containsDuplicateII.containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2);
        assertFalse(isContains);
    }

    @Test
    public void test4() {
        boolean isContains = containsDuplicateII.containsNearbyDuplicate(new int[] { 99, 99 }, 2);
        assertTrue(isContains);
    }

}
