package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S842SplitArrayIntoFibonacciSequence;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S842SplitArrayIntoFibonacciSequenceTest {

    private S842SplitArrayIntoFibonacciSequence splitArrayIntoFibonacciSequence = new S842SplitArrayIntoFibonacciSequence();

    @Test
    public void test1() {
        List<Integer> fibonacci = splitArrayIntoFibonacciSequence.splitIntoFibonacci("123456579");
        Assert.assertEquals(Arrays.asList(123, 456, 579), fibonacci);
    }

    @Test
    public void test2() {
        List<Integer> fibonacci = splitArrayIntoFibonacciSequence.splitIntoFibonacci("11235813");
        Assert.assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13), fibonacci);
    }

    @Test
    public void test3() {
        List<Integer> fibonacci = splitArrayIntoFibonacciSequence.splitIntoFibonacci("112358130");
        Assert.assertTrue(fibonacci.isEmpty());
    }

    @Test
    public void test4() {
        List<Integer> fibonacci = splitArrayIntoFibonacciSequence.splitIntoFibonacci("0123");
        Assert.assertTrue(fibonacci.isEmpty());
    }

    @Test
    public void test5() {
        List<Integer> fibonacci = splitArrayIntoFibonacciSequence.splitIntoFibonacci("1101111");
        Assert.assertEquals(Arrays.asList(110, 1, 111), fibonacci);
    }

}
