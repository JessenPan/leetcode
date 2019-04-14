package org.jessenpan.leetcode.array;

import org.junit.Test;

import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S1018BinaryPrefixDivisibleBy5Test {

    private S1018BinaryPrefixDivisibleBy5 binaryPrefixDivisibleBy5 = new S1018BinaryPrefixDivisibleBy5();

    @Test
    public void test1() {
        List<Boolean> result = binaryPrefixDivisibleBy5.prefixesDivBy5(new int[] { 0, 1, 1 });
        assertEquals(asList(TRUE, FALSE, FALSE), result);
    }

    @Test
    public void test2() {
        List<Boolean> result = binaryPrefixDivisibleBy5.prefixesDivBy5(new int[] { 1, 1, 1 });
        assertEquals(asList(FALSE, FALSE, FALSE), result);
    }

    @Test
    public void test3() {
        List<Boolean> result = binaryPrefixDivisibleBy5.prefixesDivBy5(new int[] { 0, 1, 1, 1, 1, 1 });
        assertEquals(asList(TRUE, FALSE, FALSE, FALSE, TRUE, FALSE), result);
    }

    @Test
    public void test4() {
        List<Boolean> result = binaryPrefixDivisibleBy5.prefixesDivBy5(new int[] { 1,1,1,0,1});
        assertEquals(asList(FALSE, FALSE, FALSE, FALSE, FALSE), result);
    }

}
