package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S27RemoveElementTest {

    private S27RemoveElement removeElement = new S27RemoveElement();

    @Test
    public void test() {
        int[] origin = new int[] { 3, 2, 2, 3 };
        int num = removeElement.removeElement(origin, 3);
        assertEquals(2, num);
    }

    @Test
    public void test1() {
        int[] origin = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        int num = removeElement.removeElement(origin, 2);
        assertEquals(5, num);
    }

}
