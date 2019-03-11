package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 * @date 2019-03-11 20:06
 */
public class S217ContainsDuplicateTest {

    private S217ContainsDuplicate containsDuplicate = new S217ContainsDuplicate();

    @Test
    public void test1() {
        boolean isDuplicated = containsDuplicate.containsDuplicate(new int[] { 1, 2, 3, 1 });
        assertTrue(isDuplicated);
    }

    @Test
    public void test2() {
        boolean isDuplicated = containsDuplicate.containsDuplicate(new int[] { 1, 2, 3, 4 });
        assertFalse(isDuplicated);
    }

    @Test
    public void test3() {
        boolean isDuplicated = containsDuplicate.containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 });
        assertTrue(isDuplicated);
    }

}
