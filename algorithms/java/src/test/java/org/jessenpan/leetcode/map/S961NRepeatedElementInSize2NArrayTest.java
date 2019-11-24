package org.jessenpan.leetcode.map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S961NRepeatedElementInSize2NArrayTest {

    private S961NRepeatedElementInSize2NArray nRepeatedElementInSize2NArray = new S961NRepeatedElementInSize2NArray();

    @Test
    public void test1() {
        int nRepeatedElement = nRepeatedElementInSize2NArray.repeatedNTimes(new int[] { 1, 2, 3, 3 });
        assertEquals(3, nRepeatedElement);
    }

    @Test
    public void test2() {
        int nRepeatedElement = nRepeatedElementInSize2NArray.repeatedNTimes(new int[] { 2, 1, 2, 5, 3, 2 });
        assertEquals(2, nRepeatedElement);
    }

    @Test
    public void test3() {
        int nRepeatedElement = nRepeatedElementInSize2NArray.repeatedNTimes(new int[] { 5, 1, 5, 2, 5, 3, 5, 4 });
        assertEquals(5, nRepeatedElement);
    }

}
