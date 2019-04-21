package org.jessenpan.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S925LongPressedNameTest {

    private S925LongPressedName longPressedName = new S925LongPressedName();

    @Test
    public void test1() {
        boolean isRepeated = longPressedName.isLongPressedName("alex", "aaleex");
        assertTrue(isRepeated);
    }

    @Test
    public void test2() {
        boolean isRepeated = longPressedName.isLongPressedName("saeed", "ssaaedd");
        assertFalse(isRepeated);
    }

    @Test
    public void test3() {
        boolean isRepeated = longPressedName.isLongPressedName("leelee", "lleeelee");
        assertTrue(isRepeated);
    }

    @Test
    public void test4() {
        boolean isRepeated = longPressedName.isLongPressedName("laiden", "laiden");
        assertTrue(isRepeated);
    }

    @Test
    public void test5() {
        boolean isRepeated = longPressedName.isLongPressedName("pyplrz", "ppyypllr");
        assertFalse(isRepeated);
    }

}
