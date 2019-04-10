package org.jessenpan.leetcode.array;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S989AddToArrayFormOfIntegerTest {

    private S989AddToArrayFormOfInteger addToArrayFormOfInteger = new S989AddToArrayFormOfInteger();

    @Test
    public void test1() {
        List<Integer> list = addToArrayFormOfInteger.addToArrayForm(new int[] { 9, 9, 9, 9,9, 9, 9, 9, 9, 9 }, 1);
        assertEquals(asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), list);
    }

}
