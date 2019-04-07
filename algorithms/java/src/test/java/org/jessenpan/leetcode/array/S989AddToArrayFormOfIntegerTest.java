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
        List<Integer> result = addToArrayFormOfInteger.addToArrayForm(new int[] { 1, 2, 0, 0 }, 34);
        assertEquals(asList(1, 2, 3, 4), result);
    }

    @Test
    public void test2() {
        List<Integer> result = addToArrayFormOfInteger.addToArrayForm(new int[] { 2, 7, 4 }, 181);
        assertEquals(asList(4, 5, 5), result);
    }

    @Test
    public void test3() {
        List<Integer> result = addToArrayFormOfInteger.addToArrayForm(new int[] { 2, 1, 5 }, 806);
        assertEquals(asList(1, 0, 2, 1), result);
    }

    @Test
    public void test4() {
        List<Integer> result = addToArrayFormOfInteger.addToArrayForm(new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 }, 1);
        assertEquals(asList(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), result);
    }

}
